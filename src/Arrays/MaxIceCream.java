package Arrays;

public class MaxIceCream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] costs= {1,3,2,4,1};
//		int coins=7;
		 int[] costs = {1,6,3,1,2,5};
		 int coins = 20;
		int res=0;
		 for(int i=0;i<costs.length;i++){
	            int count=0;
	            int ans=0;
	            for(int j=0;j<costs.length;j++){
	               // if(i!=j){
	                    ans=ans+costs[j];
	                    count++;
	                    if(ans>=coins){
	                    	  res=Math.max(res,count);
	                    }
	                //}

	            }
	       }
	
	    
	System.out.println(res);

	}

}
