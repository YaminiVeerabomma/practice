package Arrays;
import java.util.*;

public class MaxToysWithBudget_sldwd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cost = {1, 12, 5, 111, 200, 1000, 10, 9, 12, 15};
        int K = 50;
        Arrays.sort(cost); // Sort the array to buy cheaper toys first
        int n=cost.length;
        int start = 0;
        int end = 0;
        int sum = 0;
        int count = 0;
        while(end < n) {
            sum =sum+ cost[end];
            if (sum > K) {
                sum =sum-cost[start];
                start++;
            } else {
                count++;
            }

            end++;
        }
        System.out.println(count);

	}
	

}
