package Arrays;

import java.util.List;

public class ZerosMovingAtTheEndApp2 {
	
		public int[] zerosMovingArray(int[] arr)
		{
          int n=arr.length;
         // System.out.println(n);
          int count=0;
          for(int i=0;i<n;i++)
          {
        	  if(arr[i]!=0)
        	  {
        	   
        		  int temp=arr[i];
        		  arr[i]=arr[count];
        		  arr[count]=temp;
        		  count=count+1;
        	     }
              
        
          }
		return arr;
        
		}

	public static void main(String[] args) {
		int[] arr= {1,2,0,4,3,0,5,4,0,0,9,0,0,0};
		ZerosMovingAtTheEndApp2 ze=new ZerosMovingAtTheEndApp2();
		int[]
				outputarr=ze.zerosMovingArray(arr);
        for(int i=0;i<outputarr.length;i++)
        {
        	System.out.print(outputarr[i]);
        }
	}

}
