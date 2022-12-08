package BashirSir;

public class FrequencyFinder1 {
    void charFrequency(String s){
        //we create and new int array name hash and passed value is 26
        int [] hash = new int[26];
        for (int i = 0; i < s.length();i++){
            if (s.charAt(i) != ' '){
                hash[s.charAt(i) - 'a']++;
            }
        }
        for (int i = 0; i < 26; i++){
            if (hash[i] > 0){
                //we cast int into char
                System.out.println((char) (i + 'a') + " " + hash[i]);
            }
        }
    }

    public static void main(String[] args) {
        String s = "lucknow junction";
        FrequencyFinder1 ff1 = new FrequencyFinder1();
        ff1.charFrequency(s);
    }
}
