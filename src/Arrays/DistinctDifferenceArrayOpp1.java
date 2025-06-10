package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.*;

public class DistinctDifferenceArrayOpp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int[] arr = {3, 2, 3, 4, 2};
        int n = arr.length;

        int[] prefixDistinct = new int[n];
        Set<Integer> prefix = new HashSet<>();
        int prefixCount = 0;
        for (int i = 0; i < n; i++) {
        	prefixDistinct[i] = prefixCount;
            if (!prefix.contains(arr[i])) {
                prefix.add(arr[i]);
                prefixCount++;
                prefixDistinct[i] = prefixCount;
            }
        }
        for(int j=0;j<n;j++) {
        	System.out.print(prefixDistinct[j]);
        }
        System.out.println(" ");
       // System.out.println(prefix);

        int[] postfixDistinct = new int[n];
        Set<Integer> postfix = new HashSet<>();
        int postfixCount = 0;
        for (int i = n - 1; i >= 0; i--) {
        	 postfixDistinct[i] = postfixCount; 
            if (!postfix.contains(arr[i])) {
                postfix.add(arr[i]);
                postfixCount++;
                //postfixDistinct[i] = postfixCount;
            } 
        }
        for(int j=0;j<n;j++) {
        	System.out.print
        	(postfixDistinct[j]);
        }
        System.out.println(" ");

 
        int[] diff = new int[n];
        for (int i = 0; i < n; i++) {
            diff[i] = prefixDistinct[i] - postfixDistinct[i];
        }
        System.out.println(Arrays.toString(diff)); 
	}

}
