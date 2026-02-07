package Arrays;
import java.util.Scanner;


public class Find_Sum_Of_Query_Dynamic {


	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // 1. Enter array length
	        System.out.print("Enter array length: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];

	        // 2. Enter array elements
	        System.out.println("Enter array elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // 3. Build prefix sum
	        int[] prefix = new int[n];
	        prefix[0] = arr[0];

	        for (int i = 1; i < n; i++) {
	            prefix[i] = prefix[i - 1] + arr[i];
	        }

	        // 4. Enter number of queries
	        System.out.print("Enter number of queries: ");
	        int q = sc.nextInt();

	        // 5. Process each query
	        for (int i = 0; i < q; i++) {
	            System.out.print("Enter left and right index: ");
	            int left = sc.nextInt();
	            int right = sc.nextInt();

	            int sum = (left == 0)
	                    ? prefix[right]
	                    : prefix[right] - prefix[left - 1];

	            System.out.println("Sum = " + sum);
	        }

	        sc.close();
	    }
	}
