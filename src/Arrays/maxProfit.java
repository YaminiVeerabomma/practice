package Arrays;
import java.util.*;

public class maxProfit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prices[]= {1,3,6,9,11};
	
		int maxProfit=0;
	for(int i=0;i<prices.length-1;i++) {
	
		for(int j=i+1;j<prices.length;j++) {
			maxProfit=Math.max(maxProfit,prices[j]-prices[i]);
		}
	}
		
	
	System.out.println(maxProfit);
	}

}
