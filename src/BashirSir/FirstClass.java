package BashirSir;

//implicit casting : The process of converting one type of object and
// variable into another type is referred to as type casting When the
// conversion automatically performs by the compiler without the programmer's
// interference, it is called implicit type casting or widening casting.
// Explicit Casting : It is done to convert from a higher data type to a lower data type.


public class FirstClass {
    public static void main(String[] args) {
        byte p = 12;
        System.out.println("byte value : "+p);
        // Implicit Typecasting
        short q = p;
        System.out.println("short value : "+q);
        int r = q;
        System.out.println("int value : "+r);
        long s = r;
        System.out.println("long value : "+s);
        float t = s;
        System.out.println("float value : "+t);
        double u = t;
        System.out.println("double value : "+u);
    }
}
