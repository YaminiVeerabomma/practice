package string;
import java.util.*;

public class PalindromRemoveAlphnumaric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="A man, a plan, a canal: Panama";
		//String s="race a car";
		//String s=" ";
		//remove spaces and  convert lowecase and delete special elements
		 String Str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		 System.out.println(Str.toCharArray());
		 Str.toLowerCase();
		int start=0;
		int end=Str.length()-1;
		boolean flag=true;
		//itarate the start end position
		while(start<=end) {
			if(Str.charAt(start)!=Str.charAt(end)) {
				flag=false;
				break;
			
				}
			start++;
			end--;
		}
		System.out.println(flag);

	}

}
//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

//Given a string s, return true if it is a palindrome, or false otherwise.
//
// 
//
//Example 1:
//
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.
//Example 2:
//
//Input: s = "race a car"
//Output: false
//Explanation: "raceacar" is not a palindrome.
//Example 3:
//
//Input: s = " "
//Output: true
//Explanation: s is an empty string "" after removing non-alphanumeric characters.
//Since an empty string reads the same forward and backward, it is a palindrome.
//  Pointers      TimeComplexity       Spacecomplexity
//		3			O(n)					O(1)
