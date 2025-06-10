package Arrays;
import java.util.*;

public class ContinueCountOfArray1 {
	
	public int ConsecutiveCount(int[] arr)
	{
		int maxCount=0;
		int count=1;
		for(int i=0;i<=arr.length-2;i++)
	     {
	    	
	    	 if(arr[i]==arr[i+1]) {
	    		 count=count+1;
	    		// System.out.println(count);
	    	 }
	    	 
	    	 else {
	    		   if(maxCount<count) {
	                    maxCount=count;
	    		   }
	    		count=1;
	 			
	    	 }
	    }

	    
	    	return maxCount;
	 }
	
	public static void main(String[] args) {
		
	    int[] arr= {1,1,1,0,0,1,0,0,0,0,0,1,1,1,1};
	    int[] arr1= {2,3,3,0};
 	    ContinueCountOfArray1 cc =new ContinueCountOfArray1();
	    int maxCount=cc.ConsecutiveCount(arr);
	    int maxCount1=cc.ConsecutiveCount(arr1);

	    System.out.println(maxCount1);
	  }
}
