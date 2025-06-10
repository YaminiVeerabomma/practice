package string;
import java.util.*;

public class RotationStringtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="aaba";
		String str2="baaa";
		String str3=str1;
		boolean result=false;
		for(int i=0;i<str1.length();i++)
		{	boolean flag=false;
		   
			StringBuilder sb=new StringBuilder(str3);
			char ch=sb.charAt(0);
			sb.deleteCharAt(0);
			sb.append(ch);
			//System.out.println(sb);
			str3=sb.toString();
			//System.out.println(str3);
			
			if(str3.equals(str2))
			{
			
			System.out.println("after  "+(i+1)+"  rotation s1 will becomes equal to s2");
			//this line for which rotation equals the given equals string
			flag=true;
			result=flag;
			}
			
	    }
		System.out.println(result);
	}
}
