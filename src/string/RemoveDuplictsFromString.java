package string;

public class RemoveDuplictsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madam";
	StringBuilder sb=new StringBuilder();
	char[] arr=s.toCharArray();
		for(int i=0;i<arr.length;i++) {
			boolean flag=false;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
				{
					flag=true;
					break;
				}
				
			}
			if(!flag) {
				sb.append(arr[i]);
			}
		
		
	     
			
		}
		System.out.println(sb);
		
	}

}
