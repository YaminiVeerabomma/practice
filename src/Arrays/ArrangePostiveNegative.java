package Arrays;
import java.util.*;

public class ArrangePostiveNegative {
	public List RearangeArray(int[] arr)
	{
		int n=arr.length;
		List postive=new ArrayList();
		List negitive=new ArrayList();
		List newarr=new ArrayList();
		for(int i=0;i<n;i++)
		{
			if(arr[i]>=0)
			{
				postive.add(arr[i]);
			}
			else {
				negitive.add(arr[i]);
			}
		}
		int min=Math.min(postive.size(), negitive.size());
		int max=Math.max(postive.size(), negitive.size());

		
		for(int i=0;i<min;i++)
		{
			newarr.add(postive.get(i));
			newarr.add(negitive.get(i));
		}
		if(postive.size()>min)
		{
			for(int i=min;i<max;i++)
			{
			newarr.add(postive.get(i));	
			}
			
		}
		if(negitive.size()>min)
		{
			for(int i=min;i<max;i++)
			{
			newarr.add(negitive.get(i));	
			}
			
		}
			
		
			
		return newarr;
	}

	public static void main(String[] args) {
	int[] arr= {1,2,3,-4,-1,4,-8,-9,10,-11,-13,-16};
	ArrangePostiveNegative apn=new ArrangePostiveNegative();
	List replacedarr=apn.RearangeArray(arr);
	System.out.print(replacedarr);
	

	}

}
