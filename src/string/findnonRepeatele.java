package string;
import java.util.*;
public class findnonRepeatele {
	
	public static void main(String[] args) {
		//String str="aabbc";
		String str="aabbcde";
	    Map<Character, Integer> cm = new LinkedHashMap<>();
	  for (int i=0;i<str.length();i++)
	  { int count=0;
		  char c=str.charAt(i);
		   count = cm.getOrDefault(c, count); 
          count++; 
          cm.put(c, count);
	  }

   char result='$';
   
    
    for(int i=0;i<str.length();i++)
	 {
		 if(cm.get(str.charAt(i))==1)
		 {
			 result=str.charAt(i);
			 break;
		
		 }
		
	}
	
	 System.out.println("first non repeating char is"+ " :"+result);
	 }
}
//in above code if first non repeating element if find print that eleement input aabbccd output d
//and if more then 1 repeating eleemnt  if print $ input aabbcc output $