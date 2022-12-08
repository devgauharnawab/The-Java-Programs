package BashirSir;

public class Main {
    public static void main(String[] args) {
        byte x = 10;
        byte y = 3;
        // casting
        byte b = (byte) (x & y);
        byte c = (byte) (x | y);
        byte d = (byte) (x ^ y);
        System.out.println("-->" +b);
        System.out.println("-->" +c);
        System.out.println("-->" + d);

    }
}
