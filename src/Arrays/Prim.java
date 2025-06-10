package Arrays;

public class Prim {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		boolean flag=true;
		 if (n <= 1)
	            flag=false;

	  
	        for (int i = 2; i < n; i++)
	            if (n % i == 0)
	                flag=false;

	       
		
		 if (flag==true)
	            System.out.println(" true");
	        else
	            System.out.println(" false");
		
		

	}

}
