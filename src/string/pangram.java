package string;
import java.util.*;
public class pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="The quick brown fox jumps over the  lazy  dog";
		s = s.toLowerCase();
		HashSet<Character> hs=new HashSet<>();
		 for (int i = 0; i < s.length(); i++)
		 {
			 char ch = s.charAt(i);
			 //System.out.println(ch);
			 if(ch>='a' && ch<='z')
			 {
				 hs.add(ch);
				// System.out.println(hs);
			 }
		} 
		 if(hs.size()==26) {
			 System.out.println(true);
		 }
		 else {
			 System.out.println(false);
		 }
		 
	}

}
//the given string is contails the all alphbets it is called pangram otherwise it is not pangram string
//hashset is not store the duplicats in string
//if remove lazy in above string output will be false becoz that string is in between a to z so it print the false