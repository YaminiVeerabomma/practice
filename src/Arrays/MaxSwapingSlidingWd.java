package Arrays;
import java.util.*;
public class MaxSwapingSlidingWd {
	public int MaxSwapwd(int[] arr, int b) {
		int n=arr.length;
		int fevelem=0;
		for(int i=0;i<n;i++) {
			if(arr[i]<b) {
				fevelem++;
			}
		}
		System.out.println(fevelem);
		int count=0;
	
		for(int i=0;i<fevelem;i++) {
		
			if(arr[i]>b) {
				System.out.println(arr[i]);
				count++;
			}
		}
		int maxcount=count;
		System.out.println(maxcount);
		int start=1;
		int end=fevelem;
		
		while(end<n) {
			
			
				if(arr[start-1]>b) {
					count--;
				}
				 else if(arr[end]>b) {
					 count++;
					 
				 }
				maxcount=Math.max(maxcount, count);
				start++;
				end++;
				
			}
		
		return maxcount ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr= {1,8,10,7,14,11,5};
//		int b=8;
		int[] arr= {15,11,100,17};
		int b=20;
		MaxSwapingSlidingWd  mxs=new MaxSwapingSlidingWd ();
		int result=mxs.MaxSwapwd(arr,b);
		System.out.println(result);

	}

	

}
