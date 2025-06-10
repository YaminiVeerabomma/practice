package Arrays;
import java.util.*;

public class maxProductOfAnySubarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {-2,6,-3,-10,0,2};
         // int arr[]= {-1,-3,-10,0,60};
          int maxProd = arr[0];  
          int minProd = arr[0];  
          int result = arr[0];   


          for (int i = 1; i < arr.length; i++) {
              if (arr[i] < 0) {
                  
                  int temp = maxProd;
                  maxProd =minProd;
                  minProd = temp;
              }

              
              maxProd = Math.max(arr[i], maxProd * arr[i]);
              
              minProd = Math.min(arr[i], minProd * arr[i]);
              
              result = Math.max(result, maxProd);
          }

         
          System.out.println(result);     
          
	}

}
