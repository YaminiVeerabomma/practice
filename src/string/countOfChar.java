package string;
import java.util.*;
import java.util.Set;

public class countOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aba";
		int count=0;
		Set<Character> set=new HashSet<>();
		for(int i=0;i<s.length();i++) {
		if(!set.contains(s.charAt(i))) {
			count=count+1;
			set.add(s.charAt(i));
		}
	
		}

		System.out.println(count);
	}

}
