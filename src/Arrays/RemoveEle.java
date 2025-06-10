package Arrays;

import java.util.Arrays;

public class RemoveEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {3,2,2,3};
		int val=2;
		int n=nums.length;
		int k = 0;
        for(int i = 0; i< n; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
		System.out.println(k+" "+Arrays.toString(Arrays.copyOf(nums, k)));	

	}

}
