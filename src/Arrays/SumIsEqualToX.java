
package Arrays;
import java.util.*;

public class SumIsEqualToX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {-1,-2,4,-6,5,7};
		int[] arr2= {6,3,4,0};
		int x=8;
		int n1=arr1.length;
		int n2=arr2.length;
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
				if(arr1[i]+arr2[j]==x)
				{
					System.out.print(arr1[i]+" ");
					System.out.print(arr2[j]+" ");
				}
			}
		}
		

	}

}

