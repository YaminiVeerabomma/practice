package streams;

import java.util.*;
import java.util.stream.Collectors;

public class ConvertMapToList {

	public static void main(String[] args) {
	        
	        // 1. Define the original Map
	        Map<String, List<Integer>> dataMap = new HashMap<>();
	        dataMap.put("A", Arrays.asList(1, 2, 3));
	        dataMap.put("B", Arrays.asList(4, 5));
	        dataMap.put("C", Arrays.asList(6, 7, 8, 9));

	        System.out.println("Original Map: " + dataMap);
	        // Original Map: {A=[1, 2, 3], B=[4, 5], C=[6, 7, 8, 9]}

	        // 2. Convert the Map to a List using flatMap
	        List<Integer> flattenedList = dataMap.values().stream() 
	            // 2a. dataMap.values() gives us a Collection of List<Integer>
	            // 2b. .stream() converts this to a Stream<List<Integer>>
	            
	            .flatMap(List::stream) 
	            // 3. flatMap takes each inner List<Integer> and converts it 
	            //    into a Stream<Integer> (using List::stream), then flattens 
	            //    all those inner streams into one single Stream<Integer>.
	            
	            .collect(Collectors.toList()); 
	            // 4. Collect the single Stream<Integer> into a final List<Integer>.

	        System.out.println("Flattened List: " + flattenedList);
	        // Flattened List: [1, 2, 3, 4, 5, 6, 7, 8, 9] (Order may vary due to HashMap)
	    }
	}