package Arrays;

import java.util.Arrays;

public class SmallestValidSubarray {

    public static int getSmallestValidSubarray(int[] arr, int k) {
        int n = arr.length;
        int start=0;
        int end=k-1;
        int count=0;
    
        int min = Integer.MAX_VALUE;
        while(end<n) {
        	 int[] window = Arrays.copyOfRange(arr, start, end + 1);
        	 int windowsize=window.length;
        	  Arrays.sort(window);
        	  for(int i=0;i<windowsize;i++) {
        		  if(window[i]==window[i+1] && window[i+1]==window[i+2] && window[i+2]==window[i+3]) {
        			 count=3;
        			 
        			 //System.out.println(windowsize);
        			 min = Math.min(min, windowsize);
        			  
        		  }
        	  }
        	  start+=0;
        	  end+=1;
        	  int[] window = Arrays.copyOfRange(arr, start, end + 1);
         	 int windowsize=window.length;
         	  Arrays.sort(window);
         	  for(int i=0;i<windowsize;i++) {
         		  if(window[i]==window[i+1] && window[i+1]==window[i+2] && window[i+2]==window[i+3]) {
         			 count=3;
         			 
         			 //System.out.println(windowsize);
         			 min = Math.min(min, windowsize);
         			  
         		  }
         	  }
        	  
        	  
        	
        	
        }
		return end;
        	
        }


    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 2, 9, 3};  
        int k = 3;

        System.out.println(getSmallestValidSubarray(arr, k));
    }
}
