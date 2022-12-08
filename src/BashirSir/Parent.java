package BashirSir;

public class Parent {
    void printer(){
        System.out.println("printer of parent");
    }
}
class Child extends Parent{
    void display(){
        super.printer();
        System.out.println("Display of child");
    }
}
class IDemo{
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
