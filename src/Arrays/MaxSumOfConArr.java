package Arrays;

public class MaxSumOfConArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2, 1, 5, 1, 3, 2};
		int k=3;
		int start=0;
		int end=k-1;
		int maxsum=Integer.MIN_VALUE;
		while(start<=arr.length-3) {
		
			int sum=0;
			for(int i=start;i<=end;i++) {
				sum=sum+arr[i];
			}
			maxsum=Math.max(maxsum, sum);
			start++;
			end++;
		}
		System.out.println(maxsum);
		

	}

}
//int windowSum = 0;
//
//for(int i=0;i<k;i++)
//windowSum += arr[i];
//
//int maxSum = windowSum;
//
//for(int i=k;i<arr.length;i++){
//windowSum += arr[i];
//windowSum -= arr[i-k];
//maxSum = Math.max(maxSum, windowSum);
//}
