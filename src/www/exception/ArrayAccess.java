package www.exception;

public class ArrayAccess {

	public static void main(String[] args)throws  ArrayIndexOutOfBoundsException{
		// TODO Auto-generated method stub
		int[] arr= {1,2,3};
		try {
		System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			 System.out.println("Exception caught: " + e);
			    throw e;
			}
		finally{
			System.out.println("finally block always excuted");
		
		}

	}

}
