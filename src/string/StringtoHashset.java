package string;
import java.util.*;

public class StringtoHashset {
	public static void main(String[] args) {
	String str="hello";
	 HashSet<Character> hs = new HashSet<>();
	 for(int i=0;i<str.length();i++)
	 {
		hs.add( str.charAt(i));
	 }
	
System.out.println(hs);
}
}