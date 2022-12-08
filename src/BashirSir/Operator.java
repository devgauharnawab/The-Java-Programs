package BashirSir;

public class Operator{
    public static void main(String args[]){
        byte x = 10;
        byte y = (byte)(x & (x - 1));

        System.out.println(y);
    }
}
