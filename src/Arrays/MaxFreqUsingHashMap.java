package Arrays;

import java.util.*;

public class MaxFreqUsingHashMap {

    public static void main(String[] args) {

        String s = "interview";

        Map<Character, Integer> map = new HashMap<>();

       
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
          if(map.containsKey(ch)) {
            map.put(ch, map.get(ch) + 1);
            }
            else {
            	map.put(ch, 1);
            }
        }
        System.out.println(map);
        int max = 0;
        char result = ' ';

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int freq = map.get(ch);

            if (freq > max) {
            	  max = freq;      
                  result = ch; 
             }
            
        }

        System.out.println(result);
    }
}
