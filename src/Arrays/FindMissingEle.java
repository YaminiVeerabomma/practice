package Arrays;
import java.util.*;

public class FindMissingEle {
	public int MissingEleInArr(int[] arr)
	{
		int n=arr.length;
		//List missing=new ArrayList();
		int result=0;
		
		for(int i=1;i<=n;i++)
		{
			boolean find=false;
			for(int j=0;j<n;j++)
			{
				if(arr[j]==i) {
					find=true;
				}
			}
				if(find==false)
			      {
				  //missing.add(i);
					result= i;
			      }
				}			
		return result;
	}
		public int Duplicate(int[] arr)
		{
			int duplicate=-1;
			for(int k=0;k<arr.length;k++)
			{
				for(int q=k+1;q<arr.length;q++)
				{
				if(arr[k]==arr[q]) {
				//System.out.print("duplicate element"+  arr[k]);
					duplicate=arr[k];
				break;
				}
				}
			}
          return duplicate;
		}
		
	
	

	public static void main(String[] args) {
		int[] arr= {4,3,6,2,1,7,1};
		FindMissingEle fe=new FindMissingEle();
		int missingele=fe.MissingEleInArr(arr);
		int duplicateele=fe.Duplicate(arr);
		System.out.println("missing element in array"+missingele);
		
		System.out.println("duplicate element in array"+duplicateele);


	}

}
