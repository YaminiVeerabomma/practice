package streams;

import java.util.*;
import java.util.stream.Collectors;

public class ListToSetUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num=Arrays.asList(1,2,3,4,5);
		  Set<Integer> set= num.stream()
		 .collect(Collectors.toSet());
		  System.out.println("Original List:" +num);		
System.out.println("List to Set:" +set);
	}

}
