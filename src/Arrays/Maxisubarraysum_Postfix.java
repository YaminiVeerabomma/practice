
package Arrays;
import java.util.*;

public class Maxisubarraysum_Postfix {
	public int arraysum(int[] arr)
	{
	int n=arr.length;
	
	int maxsum=0;
	for(int i=0;i<n;i++){
		 int currentsum=0; 
		for(int j=i;j<n;j++) {
			System.out.print(arr[j]+""+" ");
		currentsum=currentsum+arr[j];
		}
	System.out.println();
	System.out.println(currentsum);
	
	if(currentsum>maxsum)
	{
		maxsum=currentsum;
	}
	}
	return maxsum;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr= {2,3,-8,7,-1,2,3};
		
       Maxisubarraysum_Postfix  ms=new Maxisubarraysum_Postfix();
       int sum=ms.arraysum(arr);
       System.out.println(sum);
	}

}
