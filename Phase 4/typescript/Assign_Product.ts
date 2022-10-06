class Product{
    private productid:number=0;
    private name:string="";
    private quantity:number=0;
    private price:number=0;

    constructor(id:number,Pname:string,qty:number, price:number)
    {
        this.productid=id;
        this.name=Pname;
        this.quantity=qty;
        this.price=price;
    }
    display()
    {
        console.log("Product id="+this.productid);
        console.log("Product name="+this.name);
        console.log("Quantity="+this.quantity);
        console.log("Price="+ this.price);
        console.log ("total="+(this.quantity*this.price));
    }


}
let product= new Product(1,"Tv",2,23000);
product.display();