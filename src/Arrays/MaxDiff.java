package Arrays;

public class MaxDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {7,1,5,3,6,4};
		int n=arr.length;
		int max=Integer.MIN_VALUE;
		int diff=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				 diff=arr[j]-arr[i];
				
					max=Math.max(max, diff);
					
				
				
			}
		}
		System.out.println(max);

	}

}
