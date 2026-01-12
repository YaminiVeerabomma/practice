package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FisrtNonrepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String str="Accenture";

	int n=str.length();
	Map<Character,Integer> s=new HashMap<>();
	for(int i=0;i<n;i++) {
		char ch=str.charAt(i);
		if(s.containsKey(ch)) {
			s.put(ch,s.get(ch)+1);
			
			
		}
		else {
		
			s.put(ch, 1);
		}
	}
	 for (Map.Entry<Character, Integer> entry : s.entrySet()) {
		 char getKey=entry.getKey();
		 int getValue=entry.getValue();
		 if(getValue==1) {
			 System.out.println("fstNonRepetedChar:"+getKey);
			 break;
		 }
		
	}
	
		}

}
