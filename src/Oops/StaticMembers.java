package Oops;
// Day 2
public class StaticMembers {
    static int x;
    int y;

    StaticMembers(int a , int b){
        x = a;
        y = b;
    }

    public static void main(String[] args) {
        System.out.println(StaticMembers.x);
        StaticMembers sm1 = new StaticMembers(10,20);
        StaticMembers sm2 = new StaticMembers(20,40);
        System.out.println(StaticMembers.x + " " + sm1.y);
        System.out.println(sm2.x + " " + sm2.y);
    }
}
