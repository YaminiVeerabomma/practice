package Arrays;

public class FirstNegIntSldW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-8, 2, 3, -6, 1};
		int k=2;
		int n=arr.length;
		int start=0;
		int end=k-1;

		while(end<n) {
		for(int i=start;i<=end;i++) {
			if(arr[i]<0) {
				System.out.println(arr[i]);
			}
		}
		start++;
		end++;
		}

	}

}
