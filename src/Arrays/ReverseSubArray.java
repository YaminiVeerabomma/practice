package Arrays;
import java.util.ArrayList;
import java.util.List;

public class ReverseSubArray {
	public List conSubarray(int[] arr) {
		int k=5;
		int n=arr.length;
		List<Integer>arr1=new ArrayList<Integer>();
		int index=k-1;
		while(index<n) {
			for(int i=index;i>=index-k+1;i--)
			{
			
				arr1.add(arr[i]);
			}
			index=index+k;//9
				
            }
		index=index-k;//4
		for(int i=n-1;i>index;i--)
		{
			arr1.add(arr[i]);
		}
		return arr1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8};
		ReverseSubArray rs=new ReverseSubArray();
		List newarr=rs.conSubarray(arr);
		System.out.println(newarr);
		}
	}
