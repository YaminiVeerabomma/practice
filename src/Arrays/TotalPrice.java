package Arrays;

public class TotalPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices= {5,3,8,6};
		int totalCost=prices[0];
		int minPrice=prices[0];
		
		for(int i=1;i<prices.length;i++) {
			
			
			int disscount_p=prices[i]-minPrice;
			if(disscount_p<0){
				totalCost=totalCost+0;
			}
			else {
				totalCost=totalCost+disscount_p;
				
			}
			minPrice=Math.min(minPrice, prices[i]);
			
		}
		
		System.out.println("totalCost: "+totalCost);

	}

}
