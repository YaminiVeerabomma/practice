package streams;

import java.util.*;

public class CheckCondOfListOfStringUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> str=Arrays.asList("java","jyo","hi");
		Boolean result=str.stream()
				.allMatch(s -> s.length() > 2);
		System.out.println("check list of string length greater then 2:" +result);

	}
}