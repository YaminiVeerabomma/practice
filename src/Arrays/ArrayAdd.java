package Arrays;

public class ArrayAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4500,10000,3500,3500,11000,5000,4000,10000};
		int n=arr.length;
		int sum=arr[0];
		for(int i=1;i<n;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
		int m=47000;
		int c=sum-m;
		System.out.println(c);
		
		

	}

}
