package Arrays;



public class OddEvenSumDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6};
		int n=arr.length;
		int even=0;
		int odd=0;
		int result=0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
			even=even+arr[i];	
			}
			else {
			odd=odd+arr[i];	
			}
		}
		result=even-odd;
		System.out.println(result);

	}

}
