package Arrays;
import java.util.*;

public class MaxSubArraySumUsingSlidingWndOpp {
	public int  MaxSubArrSum(int[] arr,int k) {
		int n=arr.length;
		int sum=0;
		
		if (n < k) {
            System.out.println("Invalid input: k is larger than array size");
            return -1;
        }
		int ans=Integer.MIN_VALUE;
        for(int i=0;i<=k-1;i++) {
        	sum=sum+arr[i];
        }
        ans=Math.max(ans, sum);
        //System.out.println(ans);
        int start=1;
        int end=k;
        
        while(end<n) {
        	sum=sum-arr[start-1]+arr[end];
        	 ans=Math.max(ans, sum);
        	 start++;
        	 end++;
        }
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8};
		int k=5;
		MaxSubArraySumUsingSlidingWndOpp Mxsum=new MaxSubArraySumUsingSlidingWndOpp();
		 int result=Mxsum.MaxSubArrSum(arr,k);
		 System.out.println( "max sub array sum :"+result);
	}

}
