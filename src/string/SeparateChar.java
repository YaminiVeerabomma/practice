package string;

public class SeparateChar {
	public static void main(String[] args) {
		String str="aB3@x9#";
		StringBuilder latters=new StringBuilder();
		StringBuilder nums =new StringBuilder();
		StringBuilder spc=new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch<= 'z')) {
                latters.append(ch);
            } else if (ch >= '0' && ch<= '9') {
                nums.append(ch);
            } else {
                spc.append(ch);
            }
		}
		System.out.println("latters:" +latters);
		System.out.println("nums:" +nums);
		System.out.println("spc:" +spc);
		
		
		
		
	}
	

}
