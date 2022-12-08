package BashirSir;
import java.util.Map;
import java.util.TreeMap;

//find frequency of every word

public class FrequencyOfEveryWord {
    static void countFreq(String str){
        Map<String,Integer> mp = new TreeMap<String , Integer>();
        //spitting to find the word
        String arr[] = str.split(" ");

        //loop to iterate over the words

        for (int i = 0; i < arr.length; i++){
            //condition to check if the array element found in hash map
            if (mp.containsKey(arr[i])){
                mp.put(arr[i], mp.get(arr[i] + 1));
            }else {
                mp.put(arr[i] , 1);
            }
        }
        //loop to iterate over the elements of the map
        for (Map.Entry<String,Integer> entry: mp.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String str = " Gauhar My Name Is  Gauhar Nawab";
        //method call
        countFreq(str);
    }
}
