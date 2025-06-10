package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ZerosMovingAtTheEndApp1 {
	public  List ZerosMovingArray(int[] arr)
	{
	List newarr=new ArrayList();
	//int length=n;
        for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0) {
				newarr.add(arr[i]);
				System.out.println(newarr);
			}
		}
         int lengthDif=arr.length-newarr.size();
         for(int i=0;i<lengthDif;i++)
         {
        	 newarr.add(0);
         }
         return newarr;
         
         
	}


	public static void main(String[] args) {
		int[] arr= {1,2,0,4,3,0,5,0};
		
		ZerosMovingAtTheEnd ze=new ZerosMovingAtTheEnd ();
		List newarr=ze.ZerosMovingArray(arr);
		System.out.println(newarr);
		

		

	}

}
