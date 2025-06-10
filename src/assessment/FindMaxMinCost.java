package assessment;
import java.util.List;
import java.util.*;

public class FindMaxMinCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cost= {1,2,3,2,5};
		int k=2;
		int n=cost.length;
		 List<Integer> pairSums = new ArrayList<>();
		for(int i=0;i<n-1;i++) {
			pairSums.add(cost[i]+cost[i+1]);
			
		}
		System.out.println(pairSums);
		Collections.sort(pairSums);
		System.out.println(pairSums);
		int base=cost[0]+cost[n-1];
		int minCost=base;
		int maxCost=base;
		for(int i=0;i<k-1;i++) {
			minCost=minCost+pairSums.get(i);
		}
		for(int i=0;i<k-1;i++) {
			maxCost=maxCost+pairSums.get(pairSums.size()-1-i);
		}
		System.out.println("minCost"+ minCost);
		System.out.println("maxCost"+ maxCost);
		

	}

}


