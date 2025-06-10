package sorting;
import java.util.*;


public class SelectionSort {
	public static void main(String[] args) 
	{
		int a[]={12,25,18,32,30,28};

		int n=a.length;
		for( int i=0;i<n-1;i++)
		{
		int min_idx=i;
		for( int j=i+1;j<n-1;j++)
			{

				if(a[j]<a[min_idx])
				{
				 min_idx=j;
				}
			}
              
					 int temp=a[min_idx];
					a[min_idx]=a[i];
					a[i]=temp;
		}
		System.out.println(Arrays.toString(a));
	}
}
