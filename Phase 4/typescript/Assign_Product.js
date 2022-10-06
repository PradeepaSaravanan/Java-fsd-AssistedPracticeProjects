var Product = /** @class */ (function () {
    function Product(id, Pname, qty, price) {
        this.productid = 0;
        this.name = "";
        this.quantity = 0;
        this.price = 0;
        this.productid = id;
        this.name = Pname;
        this.quantity = qty;
        this.price = price;
    }
    Product.prototype.display = function () {
        console.log("Product id=" + this.productid);
        console.log("Product name=" + this.name);
        console.log("Quantity=" + this.quantity);
        console.log("Price=" + this.price);
        console.log("total=" + (this.quantity * this.price));
    };
    return Product;
}());
var product = new Product(1, "Tv", 2, 23000);
product.display();
