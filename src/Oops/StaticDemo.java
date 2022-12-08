package Oops;
// ham static ka use karte hai take hame object na banana pade
// or ham reference variable ka use karke bhi print kar sakte hai
public class StaticDemo {
    static void printer(){
        System.out.println("printer Method");
    }
    void show(){
        System.out.println("Show Method");
    }
  // jab ham class load karte hai jvm me to sabse pehle static load hoga
    public static void main(String[] args) {
      //  StaticDemo.printer();
        StaticDemo sd = new StaticDemo();
        StaticDemo sd1 = new StaticDemo();
        //sd.show();
        //sd.printer();
    }
    //Static Block or non Static block
    static {
        System.out.println("Static Block");
    }
    {
        System.out.println("Non Static block");
    }
}
