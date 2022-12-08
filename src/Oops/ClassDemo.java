package Oops;
// Day 1
// example of class

public class ClassDemo {
    int x;
    String s;
    float f;
    ClassDemo(){  //constructor
        x = 10;
    }

    public static void main(String[] args) {
        ClassDemo cd = new ClassDemo();
        System.out.println(cd.x);
        System.out.println(cd.s);
        System.out.println(cd.f);
    }
}
