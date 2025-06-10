package Arrays;
import java.util.*;

public class RemoveDupFromSortedArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,1,2,4,4,6,7};
		int n=arr.length;
		List l=new ArrayList<>();
		int k=0;
		for(int i=0;i<n;i++) {
			if(!l.contains(arr[i])) {
				l.add(arr[i]);
				k++;
				
			}
			
		}
		System.out.println(k);
		System.out.println(l);

	}

}
