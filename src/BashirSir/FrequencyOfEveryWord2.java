package BashirSir;
import java.util.*;
//find frequency of every words using hash map
public class FrequencyOfEveryWord2 {
    public static void main(String[] args) {
        String s = "My name is Gauhar Gauhar Nawab Nawab";
        //splitting to find the word
        String a[] = s.split(" ");
        Map<String , Integer> words = new HashMap<String , Integer>();
        for (String str : a){
            if (words.containsKey(str)){
                words.put(str , 1 + words.get(str));
            }else {
                words.put(str ,1);
            }
        }
        System.out.println( "count of the words frequency : " + words);
    }
}
