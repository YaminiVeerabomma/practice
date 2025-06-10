package Arrays;
import java.util.*;
public class MaxSubArraySumUsingSlidingWnd {
	public int MaxSum(int[] arr,int k) {
		int n= arr.length;
		 int ans=Integer.MIN_VALUE;
		 int s=0;
		 int e=k-1;
		 while(e<n) {
			 int sum=0;
			 for(int i=s;i<=e;i++) {
				 sum=sum+arr[i];
			 }
				 ans=Math.max(sum, ans);
				 s=s+1;
				 e=e+1;
			 
		 }
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8};
		int k=5;
		MaxSubArraySumUsingSlidingWnd maxsum=new MaxSubArraySumUsingSlidingWnd();
		 int result=maxsum.MaxSum(arr,k);
		 System.out.println( "max sub array sum :"+result);

	}

}
