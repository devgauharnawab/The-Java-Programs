package Oops;

public class StaticDemo1 {
    static void printer(){
        System.out.println("printer method");
    }
    void show(){
        System.out.println("Show mehthod");
    }

    public static void main(String[] args) {
        printer();
        StaticDemo1 sd1 = new StaticDemo1();
        sd1.printer();
        StaticDemo.printer();
        sd1.caller();
    }
    void caller(){
        printer();
        show();
        StaticDemo.printer();
        StaticDemo sd1 = new StaticDemo();
        sd1.show();
        sd1.printer();
    }
}
