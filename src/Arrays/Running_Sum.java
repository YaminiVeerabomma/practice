package Arrays;

public class Running_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,1,4,2};
		int n=arr.length;
		int[] result=new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			
			sum=sum+arr[i];
			result[i]=sum;
		}
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}

	}

}
