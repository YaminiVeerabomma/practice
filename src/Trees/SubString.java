package Trees;
import java.util.*;
import java.util.Map.Entry;

public class SubString {

    public static void main(String[] args) {

        String s = "ADOBECODEBANC";
        String p = "ABC";
        int n = s.length();

       
        HashMap<Character, Integer> pMap = new HashMap<>();
        for ( int i=0;i<p.length();i++) {
        	char c=p.charAt(i);
            pMap.put(c, pMap.getOrDefault(c, 0) + 1);
        }

        String minSub = "";
        int minLen = Integer.MAX_VALUE;

       
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                HashMap<Character, Integer> sMap = new HashMap<>();

               
                for (int k = i; k <= j; k++) {
                    char ch = s.charAt(k);
                    sMap.put(ch, sMap.getOrDefault(ch, 0) + 1);
                }

              //Compare with pattern
                boolean valid = true;

                for (Entry<Character, Integer> entry : pMap.entrySet()) {

                    char ch = entry.getKey();
                    int requiredCount = entry.getValue();

                    if (!sMap.containsKey(ch) || sMap.get(ch) < requiredCount) {
                        valid = false;
                        break;
                    }
                }

                

                //  Store minimum
                if (valid) {
                    int len = j - i + 1;
                    if (len < minLen) {
                        minLen = len;
                        minSub = s.substring(i, j + 1);
                    }
                }
            }
        }

        System.out.println("Minimum substring: " + minSub);
        System.out.println("Length: " + minLen);
    }
}
