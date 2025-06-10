package string;
import java.util.*;

public class RotationofString {
	public static void main(String[] args) {
		String str1="abcd";
		String str2="cdab";
		boolean result=false;
		String str3=str1;
		
		for(int i=0;i<str3.length();i++)
		{	boolean flag=false;
			StringBuilder  sb=new StringBuilder();
			for(int j=1;j<str3.length();j++)
			{	
				sb.append(str3.charAt(j));
			}
			sb.append(str3.charAt(0));
			
			str3=sb.toString();
			
			if(str3.equals(str2)) {
				flag=true;
				result=flag;
			}
		}
	
			System.out.println(result);	
		
	
	}
	
}


