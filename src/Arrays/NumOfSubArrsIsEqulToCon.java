package Arrays;

public class NumOfSubArrsIsEqulToCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,1,1};
		int k=2;
		int n=arr.length;
		int count=0;
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=i;j<n;j++) {
				sum=sum+arr[j];
				if(sum==k) {
					count++;
				}
			}
			
		}
		System.out.println(count);

	}

}
