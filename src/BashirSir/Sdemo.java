package BashirSir;


public class Sdemo {
    String reverse(String s){
        char [] sa = s.toCharArray();
        int i = 0; int j = sa.length-1;
        char temp;
        while (i < j) {
            temp = sa[i];
            sa[i] = sa[j];
            sa[j] = temp;
            j++;
            j--;
        }
        String s1 = new String(sa);
        return s1;
    }

    public static void main(String[] args) {
        Sdemo sg = new Sdemo();
        String sd = "LUCKNOW";
        System.out.println(sd);
        String s1 = sg.reverse(sd);
        System.out.println(s1);
    }
}
