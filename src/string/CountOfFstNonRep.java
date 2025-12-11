package string;
import java.util.*;
import java.util.Set;

public class CountOfFstNonRep {

	public static void main(String[] args) {
		String s = "aba";
		int count = 0;
		Set<Character> set = new HashSet<>();

		for (int i = 0; i < s.length(); i++) {
		    if (set.contains(s.charAt(i))) {
		        count++;
		    } else {
		        set.add(s.charAt(i));
		    }
		}

		System.out.println(count);
	}
}
