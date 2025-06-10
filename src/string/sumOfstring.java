package string;

public class sumOfstring {

	public static void main(String[] args) {
		String allowed="ab";
		String[] words= {"ad","bd","badab","baa"};
		int count=0;
		for(int i=0;i<words.length;i++)
		{
		    boolean result=true;
			String word=words[i];
		
			for (int j=0;j<word.length();j++)
			{
				boolean flag=false;
				for(int k=0;k<allowed.length();k++)
				{
				  if(word.charAt(j)==allowed.charAt(k))
				  {
					flag=true;
				  }
				
				}//k loop end
				  if(flag==false)
					{
						result=flag;
						break;
					}	
			}//j loop end
			 if(result==true) {
				   count=count+1;
			 } 
				
		}//i loop end
			   
  System.out.println(count);
	}

}		