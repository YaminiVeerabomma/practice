package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertUpperCaseUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> str=Arrays.asList("hello,hi,how_are_u");
		List<String> uppercase=str.stream()
							.map(String::toUpperCase) 
							.collect(Collectors.toList());
		System.out.println(uppercase);
		
		
		

	}

}
