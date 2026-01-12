package Arrays;

import java.util.HashMap;
import java.util.Map;

public class FstRepetedEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		String str="swiss";
		Map<Character,Integer> m=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(m.containsKey(ch)) {
				System.out.println(" fst repeating ch in string:"+ch);
			
				break;
				
			}
			else {
				m.put(ch,1);
				
				
			}
			
		}
		
		
	}

}
