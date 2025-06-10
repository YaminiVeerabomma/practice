package string;
import java.util.*;
import java.util.HashSet;


public class countDistinctSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="gffg";
		int  n=s.length();
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				Set<Character> set=new HashSet<>();
				boolean flag=true;
				
				for(int k=i;k<=j;k++)
				{
					 char ch = s.charAt(k);
	                    if (set.contains(ch)) {
	                    	
	                        flag= false;
	                    }
	                  set.add(ch);
	                    System.out.print(ch);
				}
				System.out.println();
				 if (flag==true) {
	                    count++;
	                }
				
			}
			
		}
		System.out.println(count);
	}

}
