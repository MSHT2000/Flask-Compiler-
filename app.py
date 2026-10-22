from flask import Flask, render_template, request, redirect, url_for, abort

app = Flask(__name__)
# product list
products = [
    {
        "id":          1,
        "name":        "Wireless Mouse",
        "category":    "Electronics",
        "price":       19.99,
        "quantity":    42,
        "description": "Ergonomic 2.4 GHz wireless mouse with silent clicks and long battery life.",
    },
    {
        "id":          2,
        "name":        "Mechanical Keyboard",
        "category":    "Electronics",
        "price":       79.50,
        "quantity":    12,
        "description": "RGB backlit mechanical keyboard with tactile blue switches and aluminium frame.",
    },
    {
        "id":          3,
        "name":        "USB-C Hub",
        "category":    "Accessories",
        "price":       34.00,
        "quantity":    0,
        "description": "7-in-1 USB-C hub with HDMI, SD reader, and 100 W power delivery.",
    },
]
# display all products in product's array
@app.route('/index')
def index():
    return render_template("index.html", products=products)

# add new product in product's array
@app.route('/product/add', methods=['GET', 'POST'])
def add_product():
    if request.method == 'POST':
        new_id = max((p["id"] for p in products), default=0) + 1
        products.append({
            "id":          new_id,
            "name":        request.form.get("name", "").strip() or "Untitled",
            "category":    request.form.get("category", "").strip(),
            "price":       float(request.form.get("price") or 0),
            "quantity":    int(request.form.get("quantity") or 0),
            "description": request.form.get("description", "").strip(),
        })
        return redirect(url_for('index'))
    return render_template("add.html", product=None)



# find product in product's array
def find_product(pid):
    """Return the product dict with the given id, or None if not found."""
    return next((p for p in products if p["id"] == pid), None)

# view product details
@app.route('/product/<int:pid>')
def details_product(pid):
    product = find_product(pid)
    if product is None:
        abort(404)                              # show 404 page if id is wrong
    return render_template("detail.html", product=product)


@app.route('/product/<int:pid>/edit', methods=['GET', 'POST'])
def edit_product(pid):
    product = find_product(pid)
    if product is None:
        abort(404)

    if request.method == 'POST':
        product["name"]        = request.form.get("name", "").strip() or product["name"]
        product["category"]    = request.form.get("category", "").strip()
        product["price"]       = float(request.form.get("price") or product["price"])
        product["quantity"]    = int(request.form.get("quantity") or product["quantity"])
        product["description"] = request.form.get("description", "").strip()
        return redirect(url_for('details_product', pid=pid))

    return render_template("edit.html", product=product)


# ----------------------------------------------------------------------
# NEW — delete route
# ----------------------------------------------------------------------
@app.route('/product/<int:pid>/delete', methods=['POST'])
def delete_product(pid):
    product = find_product(pid)
    if product is None:
        abort(404)
    products.remove(product)
    return redirect(url_for('index'))



if __name__ == '__main__':
    app.run(debug=True)