package streams;

import java.util.*;

public class LIstThoseGeetingUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> salary=Arrays.asList(15000,25000,30000,50000,45000);
		
    salary.stream()
    		 .filter(n->n>50000)
    		 .forEach(System.out::println);
	}

}
