package Arrays;

import java.util.*;

public class Find_Elm_appears_MoreThen_Cond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3, 2, 3, 2, 2, 1, 1};
		int n=arr.length;
		int con=n/3;
		Map<Integer,Integer> m=new HashMap<>();
		for(int i=0;i<n;i++) {
			if(m.containsKey(arr[i])) {
				m.put(arr[i], m.get(arr[i])+1);
			}
			else {
				m.put(arr[i],1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
			int key=entry.getKey();
			int freq=entry.getValue();
			if(freq>con) {
				System.out.println(key);
			}
		}
	}

}
