package BashirSir;

public class StringDemo3 {
    public static void main(String[] args) {
        String s = new String("LUCKNOW ");
        System.out.println(s.length());
        String s2 = "JUNCTION";
        String s3 = s.concat(s2);
        System.out.println(s3);
        String s4 = s + s2;
        System.out.println(s4);
    }
}
