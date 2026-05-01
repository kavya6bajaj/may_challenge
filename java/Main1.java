package String;

class Mobile{
    String brand;
    double price;

    void showDetails(){
        this.brand=brand;
        this.price=price;
        System.out.println("the brand is "+brand +" and cost is $"+price);


    }
}
public class Main{
    public static void main(String[] args) {
        Mobile iphone17=new Mobile();
        iphone17.brand="apple";
        iphone17.price=500.2;
        iphone17.showDetails();



    }
}
