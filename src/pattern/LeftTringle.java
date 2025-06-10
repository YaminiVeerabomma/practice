package pattern;

public class LeftTringle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,row=3;
		for ( i = 1; i <= row; i++) {

            for (j = i; j < row; j++) {
                System.out.print("  "); 
            }
   
            for ( j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
	