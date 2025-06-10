package pattern;

public class DownwardTringle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,row=3;
		for(i=row-1;i>=0;i--) {
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
