package string;

import java.util.HashMap;

public class Find_Pattern_substring {



	    public static String minWindow(String s, String t) {
	        HashMap<Character, Integer> map = new HashMap<>();

	        // store pattern frequency
	        for (char c : t.toCharArray()) {
	            map.put(c, map.getOrDefault(c, 0) + 1);
	        }

	        int left = 0, minLen = Integer.MAX_VALUE, start = 0;
	        int count = t.length();

	        for (int right = 0; right < s.length(); right++) {

	            char rChar = s.charAt(right);

	            if (map.containsKey(rChar)) {
	                if (map.get(rChar) > 0) count--;
	                map.put(rChar, map.get(rChar) - 1);
	            }

	            while (count == 0) {
	                if (right - left + 1 < minLen) {
	                    minLen = right - left + 1;
	                    start = left;
	                }

	                char lChar = s.charAt(left);
	                if (map.containsKey(lChar)) {
	                    map.put(lChar, map.get(lChar) + 1);
	                    if (map.get(lChar) > 0) count++;
	                }
	                left++;
	            }
	        }

	        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
	    }

	    public static void main(String[] args) {
	        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
	    }
	}
