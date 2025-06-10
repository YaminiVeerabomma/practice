package Arrays;
import java.util.*;

public class DivIntoEqualPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]  nums= {3,2,3,2,2,2};
		Map<Integer,Integer> m=new HashMap<>();
	    for(int i=0;i<nums.length;i++){
	        if(m.containsKey(nums[i])){
	            m.put(nums[i],m.get(nums[i]+1));
	        }
	        else{
	            m.put(nums[i],1);
	        }
	    }
	    List keys=new ArrayList<>(m.keySet());
	    System.out.println(keys);
	    for (int i = 0; i < keys.size(); i++) {
	    	int key=0;
            key = (int) keys.get(i);
            if (m.get(key) % 2 != 0) {
                System.out.println(false);
                return;
            }
        }

	        System.out.println(true);
	        
	        
	    }
	}
