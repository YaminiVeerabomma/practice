package string;

import java.util.ArrayList;
import java.util.Collections;

public class PrefixSuffixMatch {

 public static void main(String[] args) {

	        String s = "level";
	        int n = s.length();

	        String longest = "";

	        // Try all possible lengths (no overlap → n/2)
	        for (int len = 1; len <= n / 2; len++) {

	            ArrayList<Character> prefix = new ArrayList<>();
	            ArrayList<Character> suffix = new ArrayList<>();

	            // Build prefix
	            for (int i = 0; i < len; i++) {
	                prefix.add(s.charAt(i));
	            }
	            System.out.println(prefix);

	            // Build suffix (from end)
	            for (int i = n - len; i < n; i++) {
	                suffix.add(s.charAt(i));
	            }
	            System.out.println(suffix);
	            // Compare prefix and suffix
	            if (prefix.equals(suffix)) {
	                // Convert prefix list to string
	                StringBuilder sb = new StringBuilder();
	                for (char c : prefix) {
	                    sb.append(c);
	                }
	                longest = sb.toString();
	            }
	        }
	   

	        System.out.println(longest);
	    }
	}
