package Arrays;
import java.util.*;

public class FindLeadersTest {
	public static void main(String[] args) {
		int[] arr= {16,17,4,3,5,2};
		 ArrayList<Integer> leader= new ArrayList<>();
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int j;
			 boolean flag=true;
			for (j = i + 1; j < n; j++) {

			if(arr[i]<arr[j]) {
				
				flag=false;

			}
			}
			 System.out.println(flag);
			if(flag==true)
			leader.add(arr[i]);

		}
		System.out.println(leader);

		}
	}
