package Arrays;

import java.util.*;

public class SubArrayMaxBounded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums  = {2, 1, 4, 3};
			int	left  = 2;
			int	right = 3;
			//int[] max= {left,right};
			
			List<Integer> max=new ArrayList<>();
			max.add(left);
			max.add(right);
			
			int count=0;
			
			for(int i=0;i<=nums.length;i++) {
				
				for(int j=i;j<nums.length;j++) {
					int maximum=-1;
					for(int k=i;k<=j;k++) {
						System.out.print(nums[k]);
						maximum=Math.max(maximum, nums[k]);
						
					}
					System.out.print("   maximum  "+maximum);
					System.out.println();
					
					if(max.contains(maximum)) {
						 count++;
					}
					
					
				}
				
			}
			
			
			System.out.println("count"+count);

	}

}
