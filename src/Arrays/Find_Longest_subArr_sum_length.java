package Arrays;

public class Find_Longest_subArr_sum_length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10, 5, 2, 7, 1, 9};
		int k=15;
		int len=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum=sum+arr[j];
				if(sum==k) {
					 len=j-i+1;
				max=Math.max(max, len);
				
				}
			}
		}
		System.out.println(len);
	}

}
