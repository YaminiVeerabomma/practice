package string;

public class StringtoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String allowed="ab";
		String words= "badab";
	    boolean result=true;
		
		for(int i=0;i<words.length();i++)
		{	
			boolean flag=false;
			for(int j=0;j<allowed.length();j++)
			{
				if(words.charAt(i)==allowed.charAt(j)) {
					flag=true;
					
					
				}
			}
			if(flag==false) {
				result=flag;	
				break;
			}
			
		}
		if(result==true) {
			System.out.println("consistant");
		}else {
				System.out.println("not consistant");
		}
			}
		
	}


