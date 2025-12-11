package string;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "education";
        int count = 0;
        for (int i=0;i<s.length();i++) {
        	switch(s.charAt(i)) {
        	case 'a':
        	case 'e':
        	case 'i':
        	case 'o':
        	case 'u':
        		count++;
        		break;
        	 
        	
        	}
        }
        System.out.println(count);
      
	}

}
