package string;
import java.util.*;
import java.util.Set;

public class NumKLenSubstrNoRepeats_sldwd {
	public int countsubstring(String s,int k) {	
	     int count = 0;
	        int start = 0;
	        int end = k - 1;

	        while (end < s.length()) {
	            Set<Character> unique = new HashSet<>();
	            for (int i = start; i <= end; i++) {
	                char ch = s.charAt(i);
	                unique.add(ch);
	            }
	            if (unique.size() == k) {
	                count++;
	            }
	            start++;
	            end++;
	        }
	        return count;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s="geeksforgeeks";
		String s="home";
		int k=5;
		NumKLenSubstrNoRepeats_sldwd  Nls=new NumKLenSubstrNoRepeats_sldwd ();
		int result=Nls.countsubstring(s, k);
		System.out.println(result);

	}

}
