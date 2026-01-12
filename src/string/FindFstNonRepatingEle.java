package string;

import java.util.*;

public class FindFstNonRepatingEle {

    public static void main(String[] args) {
        String str = "swiss";

        
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
          }
        System.out.println(map);
      
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.get(ch) == 1) {
                System.out.println("First non-repeating character: " + ch);
                return;
            }
        }

        System.out.println("No non-repeating character found");
    }
}
