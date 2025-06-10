package assessment;

public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-2,6,-3,-10,0,2};
		int n=arr.length;
		 int maxproduct=0;
		 for(int i=0;i<n;i++) {
			int product=0;
			for(int j=i;j<n;j++) {
				product= product*arr[j];
				if(maxproduct<product) {
					maxproduct=product;
				}
			}
 
		 }
		 System.out.println(maxproduct);
	
	}

}
