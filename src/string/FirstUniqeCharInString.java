package string;
import java.util.*;
public class FirstUniqeCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s= "leetcode";
		//String s="loveleetcode";
		String s="aabb";
		int n=s.length();
		int[] freq=new int[26];//create freq array in size on 26 bcoz alphabits are 26
		for(int i=0;i<n;i++) {//ittarate the length of string
			char c=s.charAt(i);// pick the each char
			if(c>='a' && c<='z') {//condition is alphabit are not
				freq[c -'a']= freq[c-'a']+1;//incase alph so count the char
			}
		}
				int index=-1;//assume index is -1 
				//incase fst non repeating element is not found we print the -1 so we assume
				for(int j=0;j<n;j++) {
				if (freq[s.charAt(j) - 'a'] == 1) {//find the fst non repeating element is found print the index of that element
					index=j;
					break;//ONCE ELEMENT IS FOUND BREAK THE LOOP
					
				}
				
	        }
				System.out.println(index);// print the index position
		
	}

}
