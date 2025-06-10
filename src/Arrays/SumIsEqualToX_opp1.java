package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SumIsEqualToX_opp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {-1,-2,4,-6,5,7};
		int[] arr2= {6,3,4,0};
		int x=8;
		for(int i=0;i<arr2.length;i++) {
			int min_idx=i;
			for(int j= i+1;j<arr2.length;j++) {
				if(arr2[j]<arr2[min_idx]) {
					min_idx=j;
					
				}
			}
				int temp=arr2[min_idx];
				arr2[min_idx]=arr2[i];
				arr2[i]=temp;			
		}
		System.out.println(Arrays.toString(arr2));
	
		for(int i=0;i<arr1.length;i++) {
			int target=x-arr1[i];
	
			int s=0;
			int e=arr2.length-1;
			while(s<e) {
				int m=(s+e)/2;
				if(arr2[m]==target) {
					System.out.println(arr1[i]+" "+target);
					break;
					
				}
				if(arr2[m]<target) {
					s=m+1;
				}
				else {
					e=m-1;
				}
			
			}
		
		
		}
	
		
		
		
		
		

	}

}
