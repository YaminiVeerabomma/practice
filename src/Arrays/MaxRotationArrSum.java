package Arrays;

public class MaxRotationArrSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {8,3,1,2};
		int n=arr.length;
		
		int maxsum=Integer.MIN_VALUE;

		for(int r=0;r<n;r++) {
			int sum=0;
		
		for(int i=0;i<n;i++) {
			sum=sum+(i*arr[i]);
		}
		maxsum=Math.max(sum, maxsum);
		int f=arr[0];
		for(int i=0;i<n-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[n-1]=f;
		}
		System.out.println("Maximum Rotation Sum = " + maxsum);

	}

}
