package string;

import java.util.HashMap;
import java.util.Map;

public class AnagramOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str1="race";
//		String str2="care";
//		String str1="listen";
//		String str2="silent";
		String str1="hello";
		String str2="world";
		
		if(str1.length()!=str2.length()) {
			System.out.println("Not Anagram");
		}
		Map<Character,Integer> m=new HashMap<>();
		for(int i=0;i<str1.length();i++) {
			char ch=str1.charAt(i);
			if(m.containsKey(ch)) {
				m.put(ch, m.get(ch)+1);
			}
			else {
				m.put(ch, 1);
			}
		}
		System.out.println(m);
		for(int i=0;i<str2.length();i++) {
			char ch=str2.charAt(i);
			if(m.containsKey(ch)) {
				m.put(ch, m.get(ch)-1);
			}
		}
		
		System.out.println(m);
		
		for (Map.Entry<Character, Integer> entry : m.entrySet()) {
        if (entry.getValue() != 0)
        {
        	System.out.println("Not Anagram");
        	return;
            
        }
		}
		System.out.println(" Anagram");

		
	}

}
