package pattern;

public class RightPascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,row=3;
		for( i=0;i<row-1;i++) {
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=row-1;i>=0;i--) {
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	
	}

}
