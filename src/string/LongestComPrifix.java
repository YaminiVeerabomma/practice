package string;
import java.util.*;


public class LongestComPrifix {
	
	    public String longestCommonPrefix(String[] s) {
	        StringBuilder ans = new StringBuilder();
	        Arrays.sort(s);
	        System.out.println(Arrays.toString(s));
	        String first = s[0];
	        String last = s[s.length-1];
	        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
	            if (first.charAt(i) != last.charAt(i)) {
	                return ans.toString();
	            }
	            ans.append(first.charAt(i));
	        }
	        return ans.toString();
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s={"flower","flow","flight"};
		LongestComPrifix lp=new LongestComPrifix();
		String resu=lp.longestCommonPrefix(s);
		System.out.println(resu);
		
	}

}
