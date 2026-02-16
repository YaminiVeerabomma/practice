package Most_Asked_DSA;

import java.util.*;

public class Count_Freq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Yamini";
		int n=str.length();
		Map<Character,Integer> m=new HashMap<>();
		for(int i=0;i<n;i++) {
			char ch=str.charAt(i);
			if(m.containsKey(ch)) {
				m.put(ch, m.get(ch)+1);
			
			}
			else {
				m.put(ch, 1);
			}
		}
		System.out.println(m);
		
	}

}
