package String;

class student{
    String name;
    int age;

    void introduce(){
        System.out.println("hi,my name is "+name+" my age is "+age);

    }
}
public class Main{
    public static void main(String[] args) {
        student kaya = new student();
        kaya.name="kavya";
        kaya.age=19;
        kaya.introduce();



    }
}
