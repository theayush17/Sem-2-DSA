class q3
{
    public static void main(String[] args)
    {
        System.out.println("Product-Id \t Price \t Quantity");
        product p1= new product(11111, 20, 250);
        p1.display();
        product p2= new product(22222, 30, 350);
        p2.display();
        product p3= new product(33333, 40, 450);
        p3.display();
        product p4= new product(44444, 50, 550);
        p4.display();
        product p5= new product(55555, 60, 650);
        p5.display();
        System.out.println();
        product.totalPrice=p1.price+p2.price+p3.price+p4.price+p5.price;
        System.out.println("Total amount: "+product.totalPrice+"rs");
    }
}
class product
{
    int productId, price, quantity;
    static int totalPrice;
    product(int productId, int price, int quantity)
    {
        this.productId=productId;
        this.price=price;
        this.quantity=quantity;
    }
    void display()
    {
        System.out.print(productId+" \t \t ");
        System.out.print(price+" \t \t ");
        System.out.println(quantity+"g");
    }
}