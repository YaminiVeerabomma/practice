package Arrays;
import java.util.*;

public class Subarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr= {-2,-4};
		 int n=arr.length;
		 //int sum=0;
		 int maxsum=Integer.MIN_VALUE;
		 int startIndex=-1;
		 int endIndex=-1;
		 for(int i=0;i<n;i++)
		 {
			 int sum=0;
			 for(int j=i;j<n;j++)
			 {
				/* int sum=0;
				 for(int k=i;k<=j;k++)
				 {
					 */
				//System.out.print(arr[j]+" ");
				sum=sum+arr[j];
				if(sum>maxsum) { 
					startIndex=i;
					
					endIndex=j;
					
					maxsum=sum; 
					
				 }
				 //}
				
				 //System.out.println("sum"+" "+sum);
			 }
			 
		 }
		 
		System.out.println("maxsum="+" "+ maxsum);	
		for(int i=startIndex;i<=endIndex;i++)
		{
			System.out.print(arr[i]);
		}
	}

}
