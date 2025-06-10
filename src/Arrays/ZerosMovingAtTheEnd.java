package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ZerosMovingAtTheEnd {
	public  List ZerosMovingArray(int[] arr)
	{
		List newarr=new ArrayList();
		List newarr1=new ArrayList();


		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0) {
				
				newarr.add(arr[i]);
				System.out.println(newarr);
			}
			else {
				newarr1.add(arr[i]);
				System.out.println(newarr1);
				}
						
		}
		newarr1.addAll(newarr);

		return newarr1 ;
	}

	public static void main(String[] args) {
	int[] arr= {1,2,0,4,3,0,5,0};
	ZerosMovingAtTheEnd ze=new ZerosMovingAtTheEnd ();
	List newarr=ze.ZerosMovingArray(arr);
	System.out.println(newarr);
	

	}

}
