package string;

public class LengthOfLstWord {
	public int lengthoflastword(String s) {
		 s = s.trim();
	        int n=s.length();
	        int count =0;
	        for(int i=n-1;i>=0;i--){
	            if(s.charAt(i) == ' '){
	                break;
	            }
	            count = count+1;
	        }
	        return count;
	    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello world";
		LengthOfLstWord  l=new LengthOfLstWord ();
		 int rest=l.lengthoflastword (s);
		 System.out.println(rest);

	}

}
//String[] words = s.split(" ");
//return words[words.length-1].length();
