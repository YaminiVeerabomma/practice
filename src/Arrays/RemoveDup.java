package Arrays;

import java.util.HashSet;

public class RemoveDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1, 1, 2, 2, 3, 4, 4};
		int n=arr.length;
		   System.out.println(n);
       
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
               
                count++;
                
            }
        }
        System.out.println(count);
//		 HashSet<Integer> numbers = new HashSet<Integer>();
//		for(int i=0;i<n;i++) {
//			if(!numbers.contains(arr[i])) {
//				numbers.add(arr[i]);
//			}
//			
//		}
//		System.out.println(numbers.size());

	}

}
