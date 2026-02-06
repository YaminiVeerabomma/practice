package string;

import java.util.*;

public class Longest_Non_Repeating_subStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcabcbb";
		int n=str.length();
		int max=0;
		for(int i=0;i<n;i++) {
			
			HashSet<Character> s=new HashSet<>();
			int count=0;
			for(int j=i;j<n;j++) {
				char ch=str.charAt(j);
				if(!s.contains(ch)) {
					s.add(ch);
					count++;
				}else {
					break;
				}
			}
			max=Math.max(max, count);
			
			
		}
		System.out.println(max);

	}

	
}
