package string;
import java.util.*;
import java.util.Map;

public class isomorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1="aab";
//		String s2="xyz";
		String s1="aab";
		String s2="xxy";
		if(s1.length()!=s2.length())
		{
			System.out.println("false");
		}
		Map<Character,Character> m1=new HashMap<>();
	
		
		for(int i=0;i<s1.length();i++)
		{
			char ch1=s1.charAt(i);
			char ch2 =s2.charAt(i);
		
			if(m1.containsKey(ch1)) 
			{
				
		
				
				if(m1.get(ch1)!=ch2)
				{
				
					System.out.println("false");
					return;
				
				}	
			}
			else 
				{
				m1.put(ch1, ch2);

				}
		}
		System.out.println(m1);
		System.out.println("true");
			
		}
		
	
		
	}
//** isomorphic : Two strings str1 and str2 are called isomorphic if there is a one-to-one mapping possible for every character of str1 to every character of str2 and all occurrences of every character in ‘str1’ map to the same character in ‘str2’.



