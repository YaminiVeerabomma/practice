package Arrays;

public class SubArr_sum_eql_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1, 4, 20, 3, 10, 5};
		int k=33;
		int len=0;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum=sum+arr[j];
				if(sum==k) {
					 len=j-i+1;
				}
			}
		}
		System.out.println(len);
	}

}
