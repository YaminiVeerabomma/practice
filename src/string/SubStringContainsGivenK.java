package string;
import java.util.*;


public class SubStringContainsGivenK {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="geeksForgeeks";
		char ch='k';
		int count=0;
		int n=s.length();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
			 for(int k=i;k<=j;k++) {
				if(s.charAt(k)==ch) {
					count=count+1;
				
					break;
				}
				
				}	
				}
			}
		
		System.out.println(count);
	}

}
