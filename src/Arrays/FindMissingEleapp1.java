package Arrays;

public class FindMissingEleapp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,3,6,2,1,7,1};
        int repeating=0;
        int missing=0;
		int n=arr.length;
		for(int i=1;i<=n;i++)
		{
			int count=0;
			for(int j=0;j<n;j++)
			{
				if(arr[j]==i) {
					count++;
				}
			}
				if(count==2)
				{
				    repeating =i;
				    System.out.println(repeating);
				}
				else if(count==0)
				{
				    missing=i;
				    System.out.println(missing);
				}
		}			
      }	

	}


