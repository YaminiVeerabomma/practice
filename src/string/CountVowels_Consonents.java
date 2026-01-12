package string;

public class CountVowels_Consonents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Accenture india 2025";
	    str = str.toLowerCase();
		
		int n=str.length();
		int vowelscount=0;
		int consonentsCount=0;
		  for (int i = 0; i <n ; i++) {
	            char ch = str.charAt(i);

	            if (ch >= 'a' && ch <= 'z') {
	            	if(ch=='a' || ch=='e'|| ch=='i' || ch=='o'|| ch=='u') {
	                    vowelscount++;
                     }
	            	else {
	            		  consonentsCount++;
	            	}
		        }
	       }
		  System.out.println("Vowels: " + vowelscount);
	        System.out.println("consonants: "+ consonentsCount);
		  
	}

}
//for (int i = 0; i < n; i++) {
//    char ch = str.charAt(i);
//
//    switch (ch) {
//        case 'a':
//        case 'e':
//        case 'i':
//        case 'o':
//        case 'u':
//            vowelscount++;
//            break;
//
//        default:
//            if (ch >= 'a' && ch <= 'z') {
//                consonentsCount++;
//            }
//    }
//}
