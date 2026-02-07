package Arrays;
import java.util.*;

public class DistinctDifferenceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		//int[] arr= {3,2,3,4,2};
		int n=arr.length;
		List<Integer> diff=new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			Set<Integer> prefix=new HashSet<Integer>();
			
			for(int j=0;j<=i;j++) {
				prefix.add(arr[j]);
				
				
			}
			System.out.println( i + " " +"prefix "+prefix);
		
			Set<Integer> postfix=new HashSet<Integer>();
	
			for(int j=i+1;j<n;j++) {
				postfix.add(arr[j]);
			
			}
			System.out.println(i+ "  " +"postfix "+postfix);
			
			
			diff.add(prefix.size()-postfix.size());
			
			
		}
		System.out.println(diff);

	}

}
