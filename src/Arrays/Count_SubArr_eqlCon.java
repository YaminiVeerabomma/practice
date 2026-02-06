package Arrays;

public class Count_SubArr_eqlCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		int[] arr= {1, -1, 2, -2, 3};
		int n=arr.length;
		int cond=0;
		int count=0;
		for(int i=0;i<n;i++) {
			int sum = 0;
			for(int j=i;j<n;j++) {
				sum=sum+arr[j];
				if(cond==sum) {
					count++;
				}
			}
			
			
		}
		System.out.println(count);

	}

}
