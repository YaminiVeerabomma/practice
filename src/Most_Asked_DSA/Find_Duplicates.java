package Most_Asked_DSA;

import java.util.*;

public class Find_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello";
		int n=str.length();
		String Ans="";
		Set<Character> set=new HashSet<>();
		for(int i=0;i<n;i++) {
			char ch=str.charAt(i);
			if(!set.contains(ch)) {
				set.add(ch);
			}else {
				
				Ans=Ans+ch;
			}
		}
		System.out.println(Ans);
	}

}
//using Hash Map we get the freq then more then 1 freq count that char are duplicats 