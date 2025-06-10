
package string;
import java.util.*;

public class subString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="geeksforgeeks";
		int n=s.length();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				
				for(int k=i;k<=j;k++) {
				System.out.print(s.charAt(k));
				
				
				
			}
				System.out.println();
				
		    }
			}
		

	}

}
