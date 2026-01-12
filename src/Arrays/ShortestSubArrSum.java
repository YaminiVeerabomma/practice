package Arrays;

public class ShortestSubArrSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,1,2,4,3};
		int target=7;
		int min = Integer.MAX_VALUE;

		
		for(int i=0;i<arr.length;i++) {
			{
				for(int j=i;j<arr.length;j++) {
					int sum=0;
					for(int k=i;k<=j;k++) {
						sum=sum+arr[k];
						System.out.print(arr[k]);
						
					}
					System.out.println(" sum :"+sum);	
					System.out.println();
					if(sum>=target) {
					min=Math.min(min, j-i+1);	
					}
				}
				

			}
		}
		System.out.println(min);

	}

}
