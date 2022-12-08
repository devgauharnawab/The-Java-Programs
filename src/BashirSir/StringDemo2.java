package BashirSir;

public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = "Lucknow";
        String s2 =  s1;
        String s3 = "Junction";
        System.out.println(s1 == s2);
        //if we concatinate
        s1 = s1 + s3;
        System.out.println(s1 == s2);
    }
}
