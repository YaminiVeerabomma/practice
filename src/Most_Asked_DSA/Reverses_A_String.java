package Most_Asked_DSA;

public class Reverses_A_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Yamini";
		String Ans="";
		for(int i=str.length()-1;i>=0;i--) {
			
			char ch=str.charAt(i);
			Ans=Ans+ch;
		}
		
		System.out.println(Ans);
	}

}
