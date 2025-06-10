package Arrays;
import java.util.*;

public class LongestUniqueSubstr_SldWd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "geeksforgeeks";
		int start=0;
	    Set<Character> uniqueChars = new HashSet<>();
        int maxLength = 0;
        int left = 0, right = 0;

        while (right < s.length()) {
            char ch = s.charAt(right);
          
            if (!uniqueChars.contains(ch)) {
          
                uniqueChars.add(ch);
                right++;
                maxLength = Math.max(maxLength, right - left);
            } else {
                uniqueChars.remove(s.charAt(left));
                left++;
            }
        }
		System.out.println(maxLength );
	}

}
