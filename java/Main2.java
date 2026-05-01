package String;

class book{
    String title;
    String author;
    double price;

    void details(){
        this.title=title;
        this.author=author;
        this.price=price;

        System.out.println("the details are as follows \n title:"+title+"\n author:"+author+"\n price:"+price);
    }
}

public class Main{
    public static void main(String[] args) {

        // createing objects
        book book1=new book();
        book1.title="2 states";
        book1.author="chetan bhagat";
        book1.price=200;
        book1.details();
        System.out.println("--------------------");
        book book2=new book();
        book2.title="3 idiots";
        book2.author="aamir khan ";
        book2.price=400;
        book2.details();

    }
}
