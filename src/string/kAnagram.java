package string;
import java.util.*;
import java.util.Map;
public class kAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="geeks";
		String str2="eggkf";
		int k=1;
		if(str1.length()!=str2.length())
		{
			System.out.println("No");
		}
		
		Map<Character,Integer> m=new HashMap<>();
		for(int i=0;i<str1.length();i++)
		{
			char ch = str1.charAt(i);
			m.put(ch, m.getOrDefault(ch,0) +1);	
		}
		System.out.println(m);
		for(int i=0;i<str2.length();i++)
		{
			char ch = str2.charAt(i);
			if(m.containsKey(ch))
			{
				//System.out.println(m);	
				m.put(ch, m.get(ch)-1);
				//System.out.println(m);
				if(m.get(ch)==0)
				{
				m.remove(ch);
				
				}
			}

		}
	System.out.println(m);
		int diffCount=0;
		for (Map.Entry<Character, Integer> entry : m.entrySet()) {
        if (entry.getValue() > 0)
        {
            diffCount =diffCount+entry.getValue();
            
        }
		}
       System.out.println(diffCount);
        if (diffCount <=k) {
           System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    
    }
    
}

