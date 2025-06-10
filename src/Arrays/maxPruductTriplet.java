package Arrays;

import java.util.Arrays;

public class maxPruductTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]= {-10,-3,-5,-6,-20};
		int arr[]= {1, -4, 3, -6, 7, 0};
		//int arr[]= {10, 3, 5, 6, 20};
		 Arrays.sort(arr);
		 int n=arr.length;
		 for(int i=0;i<n;i++) {
			 System.out.println(arr[i]);
		 }
		
		int maxProduct1=arr[n-1]*arr[n-2]*arr[n-3];
		System.out.println(maxProduct1);
		int maxProduct2=arr[0]*arr[1]*arr[n-1];
		System.out.println(maxProduct2);
		int maxProduct=Math.max(maxProduct1, maxProduct2);
		
		 System.out.println(maxProduct);		 
//		int maxProduct=Integer.MIN_VALUE;
//		int n=arr.length;
//		for(int i=0;i<n-2;i++)
//		{
//			for(int j=i+1;j<n-1;j++)
//			{
//				for(int k=j+1;k<n;k++)
//				{
//					maxProduct=Math.max(maxProduct, arr[i]*arr[j]*arr[k]);
//				}
//			}
//		}
//		System.out.println(maxProduct);

	}

}
