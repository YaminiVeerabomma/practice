package string;
import java.util.*;

public class LengthOfLongestSubstrunique {
	public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int n = s.length();

        // Iterate over all possible substrings
        for (int i = 0; i < n; i++) {
            Set<Character> set = new HashSet<>();
            int currentLength = 0;

            for (int j = i; j < n; j++) {
                char c = s.charAt(j);
                if (set.contains(c)) {
                    break; // Duplicate character found, break the j loop
                }
                set.add(c);
                currentLength++;
            }

            // Update maxLength if a longer substring is found
            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        LengthOfLongestSubstrunique Ls=new LengthOfLongestSubstrunique ();
        int result = Ls.lengthOfLongestSubstring(s);
        System.out.println("Length of the longest substring uniqe characters: " + result);
    }
}