package Arrays;

import java.util.HashMap;
import java.util.Map;

public class FindMajorityElm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1, 1, 2, 1, 3, 5, 1};
		
		int n=arr.length;
	
		//System.out.println(cond);
		int result=-1;
		Map<Integer,Integer> freq=new HashMap<>();
		for(int i=0;i<n;i++) {
			int num=arr[i];
			if(freq.containsKey(arr[i])) {
				freq.put(num, freq.get(num)+1);
			}
			else {
				freq.put(num, 1);
				
			}
		}
		System.out.println(freq);
		
		
		for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
			int num = entry.getKey();
            int Freq = entry.getValue();
            
            if(Freq>n/2) {
            	System.out.println(Freq);
            	result=num;
            	  break;
            }
           
			
		}
 
		System.out.println(result);	
		}
			
		
		

	

}
