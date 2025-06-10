package string;
import java.util.*;
import java.util.Set;

public class CountDistinctSubStringOp {
	public static void main(String[] args) {
		String s="gffg";
		int n=s.length();
		//int result=0;
		int count=0;
		for(int i=0;i<n;i++) 
		{ 
			Set<Character> set=new HashSet<>();
			for(int j=i;j<n;j++)
			{
				
				if(!set.contains(s.charAt(j)))
				{
				System.out.print(s.charAt(j));
				set.add(s.charAt(j));
				count=count+1;
				}
				else {
					break;
				}
		
			}
			System.out.println(count );
	
	
		}
	
		
	}

}
// we find the distinct sub string s count in the above code we usethe previous count and find the actualy count
//once we get the element is not in the set that is not a distinct so we dont move the next character so we use else break statment
