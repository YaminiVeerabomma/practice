package Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddFreqHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1, 2, 2, 3, 3, 3, 3, 3, 4};
		int n=arr.length;
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++) {
			int num=arr[i];
			
			if(map.containsKey(num)) {
				map.put(num, map.get(num)+1);
				
			}
			else {
				map.put(num, 1);
			}
		}
		System.out.println(map);
		List<Integer> freqList = new ArrayList<>(map.values());
		List<Integer> oddFrq = new ArrayList<>();

		for (int i = 0; i < freqList.size(); i++) {
		    int freq = freqList.get(i);
		    if (freq % 2 != 0) {
		        oddFrq.add(freq);   
		    }
		}
		System.out.println(oddFrq);
		int maxFreq=0;
		for(int i=0;i<oddFrq.size();i++) {
			int freq=oddFrq.get(i);
			if(freq>maxFreq) {
				maxFreq=freq;
			}
		}
		System.out.println(maxFreq);
		
		 int result = Integer.MAX_VALUE;
	        
	        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

	            int num = entry.getKey();
	            int freq = entry.getValue();
	            
	           
	            	if (freq == maxFreq) {
	                    result = Math.min(result, num);
	                }
	            	
	            

	        }
	        System.out.println(result);	
				
				
				

	}

}
