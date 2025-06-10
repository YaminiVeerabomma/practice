package string;
import java.util.*;
public class ContainsNearbyDuplicate_sldWd {
	 public boolean containsNearbyDuplicate(int[] nums, int k) {
		 Set<Integer> set = new HashSet<>(); 

	        for (int i = 0; i < nums.length; i++) {
	            if (set.contains(nums[i]))
	            	{
	            	return true; 
	            	}
	            set.add(nums[i]); 

	            if (set.size() > k) {
	                set.remove(nums[i - k]); 
	            }
	        }

	        return false; 
	    }
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,1};
		int k = 3;
		ContainsNearbyDuplicate_sldWd C=new  ContainsNearbyDuplicate_sldWd();
		 boolean result=C.containsNearbyDuplicate(nums, k);
		 System.out.println(result);
	}

}
