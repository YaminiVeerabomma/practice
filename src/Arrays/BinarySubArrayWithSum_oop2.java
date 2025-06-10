package Arrays;

public class BinarySubArrayWithSum_oop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,0,1,0,1};
		int n=arr.length;
		int goal=2;
		int count=0;
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=i;j<n;j++) {
				sum=sum+arr[j];
				if(sum==goal) {
					count=count+1;
				}
			}
		}
	System.out.println(count);
	}

}
