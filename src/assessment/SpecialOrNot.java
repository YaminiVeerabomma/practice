package assessment;

import java.util.HashSet;
import java.util.Set;

public class SpecialOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aabbaaa";
		int n=s.length();
		int count=0;
		//System.out.println(n);
	
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				StringBuilder sb=new StringBuilder();
				for(int k=i;k<=j;k++)  {
				sb.append(s.charAt(k));
			
			}
			System.out.println(sb);
			int m=sb.length();
			if(sb.length()==2&&sb.charAt(0)==sb.charAt(1)) {
				count++;
			}
			else if(sb.length()>2
					&&sb.charAt(0)==sb.charAt(m-1)){
				Set<Character> set=new HashSet<>();
				for(int p=1;p<=m-2;p++) {
					set.add(sb.charAt(p));
				}
			
				if(set.size()==1) {
					count++;
					
				}
				
		
			}
			}
			
			
		}
		System.out.println(count);
		
	}

}
