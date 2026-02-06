package Arrays;

public class FindMax_SubArr_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		int n=arr.length;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=i;j<n;j++) {
				sum=sum+arr[j];
				max=Math.max(max, sum);
				
			}
		}
		System.out.println(max);

	}

}
