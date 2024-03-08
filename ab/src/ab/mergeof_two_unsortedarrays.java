package ab;

import java.util.Arrays;
import java.util.stream.Stream;

public class mergeof_two_unsortedarrays {
	
	public static void main(String[] args) {
		Integer[] ar1= {5,7,2,9,1};
		Integer[] ar2= {7,9,3,4};
		
		Integer[] merged=Stream.concat(Arrays.stream(ar1), Arrays.stream(ar2))
				.distinct()
				.sorted()
				.toArray(Integer[]::new);
		System.out.println(Arrays.toString(merged));
	}

	
}