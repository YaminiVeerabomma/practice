package Arrays;

public class N_NumberPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100;
		for(int i=1;i<=n;i++) {
			if(i%4==0&&i%6==0) {
			System.out.println("FOSIX");
		}
		else if(i%4==0) {
			System.out.println("FOUR");
		}
		else if(i%6==0) {
			System.out.println("SIX");
		}
		else
		{
			System.out.println(i);
		}
		}

	}

}
