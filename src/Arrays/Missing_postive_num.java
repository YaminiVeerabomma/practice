package Arrays;

import java.util.HashSet;

public class Missing_postive_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,4,-1,1};
		int n=arr.length;
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<n;i++) {
			if(arr[i]>=0) {
				set.add(arr[i]);
			}
		}
		for(int i=1;i<n;i++) {
			if(!set.contains(i)) {
				System.out.println(i);
			}
		}
		

	}

}
