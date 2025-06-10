package Arrays;
import java.util.*;

public class ContinueCountOfArray {
	public static void main(String[] args) {
	int[] arr= {1,1,1,0,0,1,0,0,1,1,1,1,0};
	int maxCount=0;

	for(int i=0;i<arr.length-1;i++)
	{
		//System.out.println(i);
		int count=1;
		int k;
		
		for(k =i+1;k<=arr.length-1;k++)
		{
			//System.out.println(i);
			//System.out.println(k);
			if(arr[i]==arr[k]) {
				count=count+1;
				
			}
			  else{
				  break;
				 }
		}
		//System.out.println(maxCount+" " +count);

		if(maxCount<count) {
			//System.out.println(maxCount+" " +count);
			maxCount=count;
		}
			
	}
		System.out.println(maxCount);
	

}
}