package string;
import java.util.HashMap;
import java.util.Map;

public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="test";
		int n=s.length();
		int count=0;
		
		
		Map<Character,Integer> m=new HashMap<>();
		for(int i=0;i<n;i++) {
			char c=s.charAt(i);
			m.put(c, m.getOrDefault(c, 0)+1);
		}
		System.out.println(m);
		
		

	}

}
