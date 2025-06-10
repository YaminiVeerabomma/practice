package string;
import java.util.HashSet;

public class sumOfstringtest1 {
	public static void main(String[] args) {
		String allowed="ab";
		String[] words= {"ad","ba","badab","baa"};
		
		HashSet<Character> hs = new HashSet<>();
		 for(int i=0;i<allowed.length();i++)
		 {
			hs.add( allowed.charAt(i));
		 }
		// System.out.println(hs);
		 int count=0;
		 for(int i=0;i<words.length;i++)
			{
			    boolean flag=false;
				String word=words[i];
			
				for (int j=0;j<word.length();j++)
				{
					if(hs.contains(word.charAt(j))) {
					 flag=true;
					}
					else {
						flag=false;
						break;
					}
				}
			
				if(flag==true) {
					 count=count+1;
				 }
}
System.out.println(count);		 
}
}