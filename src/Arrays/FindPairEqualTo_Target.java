package Arrays;

public class FindPairEqualTo_Target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3, 5, 2, 8, 11};
		int target=10;
		int n=arr.length;
	
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				int sum=0;
				
				sum=arr[i]+arr[j];
					if(sum==target) {
						System.out.println("["+arr[i]+","+arr[j]+"]");
						return;
						
				}
			}
		}
		
		System.out.println("not found");
	}

}
//int k=2;
//int start=0;
//int end=k-1;
//while (start <= n - 2)
//{
//	int sum=0;
//	sum=arr[start]+arr[end];
//	if(sum==target) {
//		System.out.println("[" + arr[start] +"," +arr[end] +"]");
//		return;
//	}
//	start++;
//	end++;
//}
