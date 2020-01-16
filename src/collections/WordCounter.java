package collections;

import java.util.Enumeration;
import java.util.HashMap;

public class WordCounter {
    public static void main(String[] args) {
        Integer[]nums = {10,8,25,32,68,68,10,68,682,2,32,68};
        HashMap<?,Integer> counts1= wordCount(nums);
        System.out.println(counts1);

        String str = "Hi Hello Hello hi Hi Hi";
        String words[] = str.split(" ");
        HashMap<?,Integer> counts2 = wordCount(words);
        System.out.println(counts2);
    }


    private static <T>HashMap<T,Integer>wordCount(T[] groups){
        HashMap<T,Integer>map = new HashMap<>();
        for (T key : groups){
           Integer keyValue = map.get(key);
                map.put(key,map.get(key)!= null ? map.get(key)+1:1);
            }
            return map;
        }


}
