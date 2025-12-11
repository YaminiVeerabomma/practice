package streams;
import java.util.*;
import java.util.stream.*;

public class EvenFromStream {

	public static void main(String[] args) {
		List<Integer> num= Arrays.asList(5, 10, 20, 10, 30, 40);
		
		num.stream()
		   .filter(n->n%2==0)
		   .forEach(System.out::println);

	}

}
