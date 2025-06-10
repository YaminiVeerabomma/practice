package Arrays;
import java.util.*;
public class ContainsAllCharacters_swd {
	public static void AllCharIndstr2(String s1,String s2) {
		int n1=s1.length();
		int n2=s2.length();
		int start =0;
		int end=n1-1;
		int minlength=-1;
		for(int i=start;i<end;i++) {
			Set<Character> set =new HashSet<Character>();
			char ch=s1.charAt(start);
			if(set.contains(ch)) {
				
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=" timetopractice";
		String s2="toc";
		AllCharIndstr2(s1,s2);

	}

}
