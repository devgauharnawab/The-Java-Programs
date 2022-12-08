package BashirSir;
//pattern matching using naive algorithm
public class Demo8 {
    int findPattern(String str, String pattern){
        int m = str.length() - pattern.length();
        for (int i = 0; i < m; i++){
            if (pattern.charAt(0) == str.charAt(i)){
                int j = 1;
                while (j < pattern.length()){
                    if (pattern.charAt(j) != str.charAt(i + j))break;
                    j++;
                }
                if (j == pattern.length())return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Demo8 d = new Demo8();
        String str1 = "Gauhar Nawab";
        String pat = "awa";
        int res = d.findPattern(str1 , pat);
        if (res == -1){
            System.out.println("Not found " + res);
        }else {
            System.out.println("Found");
        }
    }
}
