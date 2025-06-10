package string;
import java.util.*;
import java.util.Set;

public class subStringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abc";
		int p=2;
		int ans=0;
		
		int n=s1.length();
		for(int i=0;i<n;i++)
		{			
			for(int j=i;j<n;j++)
			{
				Set<Character> s=new HashSet<>();
			int count=0;
			int result=0;
			
				for(int k=i;k<=j;k++) 
				{
					System.out.print(s1.charAt(k)+" ");
					if(!s.contains(s1.charAt(k))) {
					s.add(s1.charAt(k));
					count=count+1;
					result=count;
					}	
					
				}

				System.out.println(result);

				if(result==p) {
					ans=ans+1;
				}
		
			}
			
		
		}
		System.out.println(ans);
		
	}

}
//first print the substrings and count the each  substring uniqe count and finally we have to find given p element  equal count  of sub string  count 
