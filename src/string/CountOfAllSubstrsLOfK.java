package string;
import java.util.*;
import java.util.List;
import java.util.Set;
	

public class CountOfAllSubstrsLOfK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s="aabab";
		//int x=3;
		String s="abcc";
		int x=2;
		int ans=0;
		
		int n=s.length();
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
	
				StringBuilder  sb=new StringBuilder( );
				for( int k=i;k<=j;k++)
				{
					sb.append(s.charAt(k));
				}
				System.out.println(sb);
				 int length=sb.length();
				System.out.println(length);
				if(length==x) {
				
				
				Set<Character> set=new HashSet<>();
			
				for(int p=0;p<length;p++)
				
				if(!set.contains(sb.charAt(p))) {
					set.add(sb.charAt(p));
				}
				int count=0;
				if(set.size()==x-1)
				{
				count=count+1;
				ans=ans+count;
				}
				
			}
		
			
		
			}
		}
		
	System.out.println(ans);
	}
}