# pure_library.py — Python نقي 100%
# نظام مكتبة بسيط (بدون Flask)
# يقرأ ملفات HTML من مجلد templates/

from http.server import HTTPServer, BaseHTTPRequestHandler
import urllib.parse
import re
import os


# ============================================================
# 1. البيانات — قائمة الكتب
# ============================================================
books = [
    {
        "id":          101,
        "title":       "Clean Code",
        "author":      "Robert Martin",
        "genre":       "Programming",
        "year":        2008,
        "pages":       464,
        "available":   True,
        "summary":     "A handbook of agile software craftsmanship.",
    },
    {
        "id":          102,
        "title":       "The Pragmatic Programmer",
        "author":      "Andrew Hunt",
        "genre":       "Programming",
        "year":        1999,
        "pages":       352,
        "available":   False,
        "summary":     "Your journey to mastery, from journeyman to master.",
    },
    {
        "id":          103,
        "title":       "Design Patterns",
        "author":      "Erich Gamma",
        "genre":       "Software Engineering",
        "year":        1994,
        "pages":       395,
        "available":   True,
        "summary":     "Elements of reusable object-oriented software.",
    },
]


# ============================================================
# 2. دوال مساعدة
# ============================================================
def find_book(bid):
    """ترجع الكتاب بمعرّف معين، أو None إن لم يوجد."""
    for b in books:
        if b["id"] == bid:
            return b
    return None


def escape_html(text):
    """حماية من XSS."""
    if text is None:
        return ""
    return (str(text)
            .replace("&", "&amp;")
            .replace("<", "&lt;")
            .replace(">", "&gt;")
            .replace('"', "&quot;"))


# ============================================================
# 3. محرّك قوالب بسيط
# ============================================================
def load_template(name):
    path = os.path.join("templates", name)
    with open(path, "r", encoding="utf-8") as f:
        return f.read()


def render(template_name, context):
    template = load_template(template_name)
    
    # 1. extends
    extends_match = re.search(r'{%\s*extends\s*"([^"]+)"\s*%}', template)
    if extends_match:
        parent_name = extends_match.group(1)
        parent = load_template(parent_name)
        child_blocks = extract_blocks(template)
        for block_name, block_content in child_blocks.items():
            pattern = r'{%\s*block\s+' + block_name + r'\s*%}.*?{%\s*endblock\s*%}'
            parent = re.sub(pattern, block_content, parent, flags=re.DOTALL)
        template = parent
    
    # 2. include
    include_pattern = r'{%\s*include\s*"([^"]+)"\s*%}'
    def replace_include(m):
        included = load_template(m.group(1))
        return render_string(included, context)
    template = re.sub(include_pattern, replace_include, template)
    
    # 3. for
    template = process_for(template, context)
    
    # 4. if
    template = process_if(template, context)
    
    # 5. {{ }}
    template = process_expressions(template, context)
    
    # 6. إزالة {% %}
    template = re.sub(r'{%.*?%}', '', template, flags=re.DOTALL)
    
    return template


def render_string(template, context):
    template = process_for(template, context)
    template = process_if(template, context)
    template = process_expressions(template, context)
    template = re.sub(r'{%.*?%}', '', template, flags=re.DOTALL)
    return template


def extract_blocks(template):
    blocks = {}
    pattern = r'{%\s*block\s+(\w+)\s*%}(.*?){%\s*endblock\s*%}'
    for m in re.finditer(pattern, template, flags=re.DOTALL):
        blocks[m.group(1)] = m.group(2)
    return blocks


def process_for(template, context):
    pattern = r'{%\s*for\s+(\w+)\s+in\s+(\w+)\s*%}(.*?){%\s*endfor\s*%}'
    
    def replace_for(m):
        var_name = m.group(1)
        iterable_name = m.group(2)
        body = m.group(3)
        iterable = context.get(iterable_name, [])
        result = ""
        for item in iterable:
            local_context = dict(context)
            local_context[var_name] = item
            result += render_string(body, local_context)
        return result
    
    while re.search(pattern, template, flags=re.DOTALL):
        template = re.sub(pattern, replace_for, template, flags=re.DOTALL)
    return template


def process_if(template, context):
    pattern = r'{%\s*if\s+([^%]+?)\s*%}(.*?)(?:{%\s*else\s*%}(.*?))?{%\s*endif\s*%}'
    
    def replace_if(m):
        condition = m.group(1).strip()
        then_body = m.group(2)
        else_body = m.group(3) or ""
        result = evaluate(condition, context)
        return then_body if result else else_body
    
    while re.search(pattern, template, flags=re.DOTALL):
        template = re.sub(pattern, replace_if, template, flags=re.DOTALL)
    return template


def evaluate(condition, context):
    condition = condition.strip()
    condition = re.sub(r'(\w+)\|length', r'len(\1)', condition)
    for key, value in context.items():
        condition = re.sub(r'\b' + key + r'\b', repr(value), condition)
    try:
        return bool(eval(condition))
    except:
        return False


def process_expressions(template, context):
    pattern = r'{{\s*(.*?)\s*}}'
    def replace_expr(m):
        expr = m.group(1).strip()
        return str(eval_expression(expr, context))
    return re.sub(pattern, replace_expr, template)


def eval_expression(expr, context):
    expr = expr.strip()
    
    # فلاتر
    if "|" in expr:
        parts = expr.split("|", 1)
        value = eval_expression(parts[0].strip(), context)
        filter_part = parts[1].strip()
        
        if filter_part == "length":
            return len(value) if value else 0
        m = re.match(r"format\(['\"]([^'\"]+)['\"]\)", filter_part)
        if m:
            return m.group(1) % value
        m = re.match(r"truncate\((\d+)\)", filter_part)
        if m:
            return str(value)[:int(m.group(1))]
        if filter_part == "upper":
            return str(value).upper()
        return value
    
    # url_for
    m = re.match(r"url_for\(['\"](\w+)['\"](.*)\)", expr)
    if m:
        return url_for(m.group(1), context, m.group(2))
    
    # or
    if " or " in expr:
        parts = expr.split(" or ", 1)
        left = eval_expression(parts[0].strip(), context)
        if left:
            return left
        return eval_expression(parts[1].strip(), context)
    
    # ternary
    m = re.match(r"(.+?)\s+if\s+(.+?)\s+else\s+(.+)", expr)
    if m:
        then_val = eval_expression(m.group(1).strip(), context)
        cond = evaluate(m.group(2).strip(), context)
        else_val = eval_expression(m.group(3).strip(), context)
        return then_val if cond else else_val
    
    # property access
    if "." in expr:
        parts = expr.split(".")
        obj = context.get(parts[0])
        for attr in parts[1:]:
            if obj is None:
                return ""
            if isinstance(obj, dict):
                obj = obj.get(attr, "")
            else:
                obj = getattr(obj, attr, "")
        return obj
    
    # method .get()
    m = re.match(r"(\w+)\.get\(['\"](\w+)['\"],\s*['\"]([^'\"]*)['\"]\)", expr)
    if m:
        obj = context.get(m.group(1), {})
        return obj.get(m.group(2), m.group(3)) if isinstance(obj, dict) else m.group(3)
    
    # string
    m = re.match(r"^['\"](.*)['\"]$", expr)
    if m:
        return m.group(1)
    
    # number
    try:
        if "." in expr:
            return float(expr)
        return int(expr)
    except ValueError:
        pass
    
    return context.get(expr, "")


def url_for(endpoint, context, args_str):
    routes = {
        "index": "/library",
        "add_book": "/book/add",
        "details_book": "/book/{bid}",
        "edit_book": "/book/{bid}/edit",
        "delete_book": "/book/{bid}/delete",
    }
    path = routes.get(endpoint, "/")
    m = re.search(r"bid=(\w+(?:\.\w+)?)", args_str)
    if m and "{bid}" in path:
        bid = eval_expression(m.group(1), context)
        path = path.replace("{bid}", str(bid))
    return path


# ============================================================
# 4. HTTP Server
# ============================================================
class RequestHandler(BaseHTTPRequestHandler):
    
    def send_html(self, html, status=200):
        self.send_response(status)
        self.send_header("Content-Type", "text/html; charset=utf-8")
        self.end_headers()
        self.wfile.write(html.encode("utf-8"))
    
    def send_css(self, css):
        self.send_response(200)
        self.send_header("Content-Type", "text/css; charset=utf-8")
        self.end_headers()
        self.wfile.write(css.encode("utf-8"))
    
    def redirect_to(self, url):
        self.send_response(302)
        self.send_header("Location", url)
        self.end_headers()
    
    def read_form(self):
        length = int(self.headers.get("Content-Length", 0))
        body = self.rfile.read(length).decode("utf-8")
        return urllib.parse.parse_qs(body)
    
    def do_GET(self):
        path = urllib.parse.urlparse(self.path).path
        
        if path == "/static/style.css":
            self.send_css(load_template("../static/style.css"))
            return
        
        if path == "/library" or path == "/":
            html = render("library.html", {"books": books})
            self.send_html(html)
            return
        
        if path == "/book/add":
            html = render("new_book.html", {"book": None})
            self.send_html(html)
            return
        
        m = re.match(r"^/book/(\d+)$", path)
        if m:
            bid = int(m.group(1))
            book = find_book(bid)
            if book is None:
                html = render("not_found.html", {})
                self.send_html(html, status=404)
            else:
                html = render("book_info.html", {"book": book})
                self.send_html(html)
            return
        
        m = re.match(r"^/book/(\d+)/edit$", path)
        if m:
            bid = int(m.group(1))
            book = find_book(bid)
            if book is None:
                html = render("not_found.html", {})
                self.send_html(html, status=404)
            else:
                html = render("modify_book.html", {"book": book})
                self.send_html(html)
            return
        
        html = render("not_found.html", {})
        self.send_html(html, status=404)
    
    def do_POST(self):
        path = urllib.parse.urlparse(self.path).path
        form = self.read_form()
        
        if path == "/book/add":
            new_id = max((b["id"] for b in books), default=100) + 1
            books.append({
                "id":        new_id,
                "title":     (form.get("title", [""])[0].strip() or "Untitled"),
                "author":    form.get("author", [""])[0].strip(),
                "genre":     form.get("genre", [""])[0].strip(),
                "year":      int(form.get("year", ["0"])[0] or 0),
                "pages":     int(form.get("pages", ["0"])[0] or 0),
                "available": form.get("available", ["off"])[0] == "on",
                "summary":   form.get("summary", [""])[0].strip(),
            })
            self.redirect_to("/library")
            return
        
        m = re.match(r"^/book/(\d+)/edit$", path)
        if m:
            bid = int(m.group(1))
            book = find_book(bid)
            if book is None:
                html = render("not_found.html", {})
                self.send_html(html, status=404)
                return
            book["title"]     = form.get("title", [""])[0].strip() or book["title"]
            book["author"]    = form.get("author", [""])[0].strip()
            book["genre"]     = form.get("genre", [""])[0].strip()
            book["year"]      = int(form.get("year", [str(book["year"])])[0] or book["year"])
            book["pages"]     = int(form.get("pages", [str(book["pages"])])[0] or book["pages"])
            book["available"] = form.get("available", ["off"])[0] == "on"
            book["summary"]   = form.get("summary", [""])[0].strip()
            self.redirect_to(f"/book/{bid}")
            return
        
        m = re.match(r"^/book/(\d+)/delete$", path)
        if m:
            bid = int(m.group(1))
            book = find_book(bid)
            if book is None:
                html = render("not_found.html", {})
                self.send_html(html, status=404)
                return
            books.remove(book)
            self.redirect_to("/library")
            return
        
        html = render("not_found.html", {})
        self.send_html(html, status=404)


# ============================================================
# 5. التشغيل
# ============================================================
if __name__ == "__main__":
    server = HTTPServer(("localhost", 8001), RequestHandler)
    print("Library server running on http://localhost:8001/library")
    server.serve_forever()