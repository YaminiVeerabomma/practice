package Arrays;
import java.util.*;

public class SingleNonDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr= {1,1,2,3,3,4,4,8,8};
		int[] arr= {3,3,7,7,10,11,11};
		//creat map collection
		Map<Integer,Integer> m=new HashMap<Integer,Integer>();
		int n=arr.length;//length of arr
		//ittarate the start to end
		for(int i=0;i<n;i++)
		{
			if(m.containsKey(arr[i])) {//if elements in more the 1 count is incr
				m.put(arr[i],m.get(arr[i])+1);
			}
			else {//else count is 1
				m.put(arr[i], 1 );
			
			}
			
		}
		System.out.println(m);//print map
		int minKey=0;//assume minkey 
		
		int minValue= Integer.MAX_VALUE;//insilize minvalue for comapire the count
		//itarate map using entry 
		for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            if (entry.getValue() < minValue) {
                minValue = entry.getValue();
                minKey = entry.getKey();
                int condition=1;
                // campare count is single means 1
                if(condition==minValue) {
                	
                
                	System.out.println(minKey);
                }
            	
            	}
                }
		
		
	}

}
//You are given a sorted array consisting of only integers where every element appears exactly twice,
//except for one element which appears exactly once.
//
//Return the single element that appears only once.
//
//Your solution must run in O(log n) time and O(1) space.
//
// 
//
//Example 1:
//
//Input: nums = [1,1,2,3,3,4,4,8,8]
//Output: 2
//Example 2:
//
//Input: nums = [3,3,7,7,10,11,11]
//Output: 10
// Pointers       TimeComplexity       SpaceComplexity 
//					O(n)					O(1)