package Arrays;
import java.util.*;

public class DistinctDifferenceArrayOpp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr= {1,2,3,4,5};
		int[] arr= {3,2,3,4,2};
		int n=arr.length;
		List<Integer> diff=new ArrayList<Integer>();
		Set<Integer> prefix = new HashSet<>();
        int[] prefixDistinct = new int[n];
        for (int i = 0; i < n; i++) {
            prefix.add(arr[i]);
            prefixDistinct[i] = prefix.size();
        }

        Set<Integer> postfix = new HashSet<>();
        int[] postfixDistinct = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            postfixDistinct[i] = postfix.size();
            postfix.add(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            diff.add( prefixDistinct[i] - postfixDistinct[i]);
        }

        System.out.println(diff);
    }
	
		

	}
