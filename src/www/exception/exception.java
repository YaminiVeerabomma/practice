package www.exception;

public class exception {

	public static void main(String[] args)throws ArithmeticException  {
		// TODO Auto-generated method stub
		int m=10;
		int n=0;
		int result=0;
		try {
				 result=m/n;
		System.out.println("result :" +result);
	}
		catch (ArithmeticException e) {
		    System.out.println("Exception caught: " + e);
		    throw e;
		}
	finally{
		System.out.println("finally block always excuted");
	}
	}

}
