package Arrays;
import java.util.*;

public class MajorityEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int nums[]= {1,1,3,1,5,2,1};
		//int nums[]= {3,3,4,2,4,4,2,2};
		int nums[]= {3};
		
		
		
		Map<Integer,Integer> m=new HashMap<>();
		int n=nums.length;
		for(int i=0;i<n;i++)
		{
			if(m.containsKey(nums[i])) {
				m.put(nums[i],m.get(nums[i])+1);
			}
			else {
				m.put(nums[i], 1);
			}
			
		}
		
		 System.out.println(m);
	        
		
		int maxKey=0;
		
		int maxValue= Integer.MIN_VALUE;
		
		for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
                int condition=n/2;
               
                if(condition<maxValue) {
                	
                    
                    System.out.println(maxKey);
                    }
                    else {
                 	   System.out.println("-1");
             	}
                 
            }
        }
   
     }

}
////Condtion =a majority in an array is an element that appears strictly 
////more than arr.size()/2 times in the array
