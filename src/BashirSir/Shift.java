package BashirSir;

public class Shift {
    public static void main(String[] args) {
        byte x = 10;
        byte y = 3;
//or we used << and >> or >>> in bitwise operator
        byte b = (byte) (x >> 1);
        byte b1 = (byte) (x >> 2);
        byte b2 = (byte) (x >> 3);
        System.out.println(b + " " + b1 + " " + b2);
    }
}
