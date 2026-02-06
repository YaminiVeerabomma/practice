package string;

import java.util.HashMap;

public class Palindrome_or_not {

    public static void main(String[] args) {

        String s = "carrace";
        int n = s.length();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        System.out.println(map);
        int oddCount = 0;
        for (int count : map.values()) 
        { 
        	if (count % 2 != 0)
        	{ 
        		oddCount++;
        		}
        	} 
        
        if (oddCount <= 1)
        {
        	System.out.println(true);
        	} 
        else { 
        	System.out.println(false); 
        }
    }
}