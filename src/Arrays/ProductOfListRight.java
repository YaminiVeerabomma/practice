package Arrays;

public class ProductOfListRight {

	

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4};
	        int n = arr.length;

	        int[] left_Pro = new int[n];
	        int[] right_Pro = new int[n];
	        int[] result = new int[n];

	        
	        left_Pro[0] = 1;
	        for (int i = 1; i < n; i++) {
	            left_Pro[i] = left_Pro[i - 1] * arr[i - 1];
	        }

	    
	        right_Pro[n - 1] = 1;
	        for (int i = n - 2; i >= 0; i--) {
	            right_Pro[i] = right_Pro[i + 1] * arr[i + 1];
	        }

	     
	        for (int i = 0; i < n; i++) {
	            result[i] = left_Pro[i] * right_Pro[i];
	        }

	       
	        for (int i=0;i<n;i++) {
	            System.out.print(result[i] + " ");
	        }
	    }
	}
