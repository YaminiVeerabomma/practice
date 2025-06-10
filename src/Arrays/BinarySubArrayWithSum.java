package Arrays;

public class BinarySubArrayWithSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,0,1,0,1};
		int n=arr.length;
		int goal=2;
		int count=0;
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<n;j++) 
			{
				int sum=0;
				for(int k=i;k<=j;k++)
				{
				System.out.print(arr[k]);
				sum=sum+arr[k];
				}
				System.out.print("   "+"sum "+sum);
				System.out.println();
			if(sum==goal) {
				count=count+1;
			}
			
		
			}
		}
		System.out.print("count="+count);
			
	}

}
