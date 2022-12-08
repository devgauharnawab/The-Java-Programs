package BashirSir;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "LUCKNOW";
        String s2 = "LUCKNOW";
        String s3 = new String("LUCKNOW");
        String s4 = new String("LUCKNOW");
        //when we compare reference
        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
        System.out.println(s1 == s3);
        //when we compare string content
        System.out.println(s1.equals(s3));
    }
}
