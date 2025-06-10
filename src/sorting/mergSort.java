package sorting;
import java.util.*;

public class mergSort {
	public static void mergsort(int[] a,int left,int right)
	{
		
	if(left<right) {
	
		int m=(left+right)/2;
		//System.out.println(m);
		mergsort(a,left,m);
		mergsort(a,m+1,right);
		merg(a,left,m,right);
		
	}
	}
	public static void merg(int[] a,int left,int m,int right) {
		int n1=m-left+1;
		int n2=right-m;
		
		int[] leftarr=new int[n1];
		int[] rightarr=new int[n2];
		for (int i = 0; i < n1; i++)
			leftarr[i] = a[left + i];
		for (int j = 0; j < n2; j++)
            rightarr[j] = a[m + 1 + j];
		
        int i = 0;
        int j = 0;
        int k = left;
      

        while (i < n1 && j < n2) {
            if (leftarr[i] <= rightarr[j]) {
                a[k++] = leftarr[i++];
            } else {
                a[k++] = rightarr[j++];
            }
        }
        
        while (i < n1) {
            a[k++] = leftarr[i++];
        }
        while(j < n2) {
        	a[k++]=rightarr[j++];
        }
        



		
	}
	
	public static void main(String[] arr)
	{
		int[] a = {70, 80, 30, 90, 40, 50, 10};

		 int n=a.length;
		 System.out.println(n);
		 mergsort(a,0,n-1);
		 for(int i=0;i<n;i++)
		 {
			 System.out.print(a[i]+" ");
		 }
		
		 
		
		
	}

}
