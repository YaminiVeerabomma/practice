package string;
import java.util.*;
public class repeatEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr={"apple","ape","ap"};
		
          Arrays.sort(arr);
           String str1=arr[0];
           String str2=arr[arr.length-1];
           int index=0;
           while(index<str1.length() && index<str2.length()) {
        	   if(str1.charAt(index)==str2.charAt(index)) {
        		   index++;
        	   }
        	   else {
        		   System.out.println("$");
        		   break;
        	   }
           }
        
           
           System.out.println( str2.substring(0,index));
	}
	
	}	
	

	
