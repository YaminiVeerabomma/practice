package string;
import java.util.*;


public class ReversAString {
	
	public static void main(String[] args) {
		String str="hi..hello!.namaste.frinds";
		String[] str1=str.split("\\.");
		for(int i=0;i<str1.length;i++)
		{
			System.out.println(str1[i]);
		}
		StringBuilder sb=new StringBuilder();
		for(int j=str1.length-1;j>=0;j--)
		{
			sb.append(str1[j]);
			sb.append(".");
		}
			System.out.print(sb);
	}
	
}


