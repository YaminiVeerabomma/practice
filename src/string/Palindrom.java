package string;
import java.util.*;

public class Palindrom {
	public static void main(String[] args) {
		String str="madam";
		 int left=0;
		 int right=str.length()-1;
		 boolean flag=false;
		while(left<right) {
			if(str.charAt(left)==str.charAt(right)) {
				flag=true;
				left++;
				right--;
			}
			
		}
		if(flag==true) {
			System.out.println("palindrome");
		}
		else {
			System.out.println(" not a palindrome");
		}
	}

}
