package BashirSir;
//how to find frequency
public class FrequencyFinder {
    void charFrequency(String s){
        int count;
        char ch;
        for(int i = 0; i<s.length();i++){
            ch = s.charAt(i);
            count = 1;
            for(int j = 0; j < s.length();j++){
                if(s.charAt(i) == s.charAt(j)){
                    if (j > i)count++;
                    else if(j < i || s.charAt(j) == ' '){
                        //count ==
                        // 0;
                        break;
                    }
                }
            }
            if (count > 0){
                System.out.println(ch + " " + count);
            }
        }
    }

    public static void main(String[] args) {
        String s = "lucknow junction";
        FrequencyFinder ff = new FrequencyFinder();
        ff.charFrequency(s);
    }
}
