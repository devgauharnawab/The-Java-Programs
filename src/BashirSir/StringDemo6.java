package BashirSir;

public class StringDemo6 {
    public static void main(String[] args) {
        String s = "Lucknow Junction";
        for (int i = 0; i < s.length(); i++){
            System.out.println(s.charAt(i));
        }
        System.out.println(s.indexOf('u'));
        System.out.println(s.lastIndexOf('u'));
    }

}
