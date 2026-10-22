from flask import Flask, render_template, request, redirect, url_for, abort

app = Flask(__name__)

books = [{"id": 101, "title": "Clean Code", "author": "Robert Martin", "genre": "Programming", "year": 2008, "pages": 464, "available": True, "summary": "A handbook of agile software craftsmanship."}, {"id": 102, "title": "The Pragmatic Programmer", "author": "Andrew Hunt", "genre": "Programming", "year": 1999, "pages": 352, "available": False, "summary": "Your journey to mastery, from journeyman to master."}, {"id": 103, "title": "Design Patterns", "author": "Erich Gamma", "genre": "Software Engineering", "year": 1994, "pages": 395, "available": True, "summary": "Elements of reusable object-oriented software."}]
def find_book(bid):
    """ترجع الكتاب بمعرّف معين، أو None إن لم يوجد."""
    for b in books:
        if b["id"] == bid:
            return b
    return None

@app.route('/library', methods=["GET"])
def library():
    return render_template("library.html", books=books)

@app.route('/book/add', methods=["GET", "POST"])
def book_add():
    if request.method == "GET":
        return render_template("new_book.html", book=None)
    elif request.method == "POST":
        new_id = max(( b["id"] for b in books ), default=100) + 1
        books.append({"id": new_id, "title": (request.form.get("title", [""])[0].strip() or "Untitled"), "author": request.form.get("author", [""])[0].strip(), "genre": request.form.get("genre", [""])[0].strip(), "year": int(request.form.get("year", ["0"])[0] or 0), "pages": int(request.form.get("pages", ["0"])[0] or 0), "available": request.form.get("available", ["off"])[0] == "on", "summary": request.form.get("summary", [""])[0].strip()})
        return redirect(url_for("library"))

@app.route('/book/<int:arg0>', methods=["GET"])
def book_arg0(arg0):
    bid = int(arg0)
    book = find_book(bid)
    if book is None:
        return render_template("not_found.html")
    else:
        return render_template("book_info.html", book=book)

@app.route('/book/<int:arg0>/edit', methods=["GET", "POST"])
def book_arg0_edit(arg0):
    if request.method == "GET":
        bid = int(arg0)
        book = find_book(bid)
        if book is None:
            return render_template("not_found.html")
        else:
            return render_template("modify_book.html", book=book)
    elif request.method == "POST":
        bid = int(arg0)
        book = find_book(bid)
        if book is None:
            return render_template("not_found.html")
        book [ "title" ] = request.form.get("title", [""])[0].strip() or book["title"]
        book [ "author" ] = request.form.get("author", [""])[0].strip()
        book [ "genre" ] = request.form.get("genre", [""])[0].strip()
        book [ "year" ] = int(request.form.get("year", [str(book["year"])])[0] or book["year"])
        book [ "pages" ] = int(request.form.get("pages", [str(book["pages"])])[0] or book["pages"])
        book [ "available" ] = request.form.get("available", ["off"])[0] == "on"
        book [ "summary" ] = request.form.get("summary", [""])[0].strip()
        return redirect(url_for('book_arg0', arg0=bid))

@app.route('/book/<int:arg0>/delete', methods=["POST"])
def book_arg0_delete(arg0):
    bid = int(arg0)
    book = find_book(bid)
    if book is None:
        return render_template("not_found.html")
    books.remove(book)
    return redirect(url_for("library"))


@app.errorhandler(404)
def not_found(error):
    return render_template("404.html"), 404

if __name__ == '__main__':
    app.run(debug=True)
