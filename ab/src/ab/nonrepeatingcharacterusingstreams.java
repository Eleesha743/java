package ab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class nonrepeatingcharacterusingstreams {
	public static void main(String[] args) {
		String name="eleels";
		
		Map<Character,Long> charcount=name.chars().mapToObj(i->(char)i)
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		
		Optional<Character> nonrepeat=charcount.entrySet().stream()
				.filter(i->i.getValue()==1)
				.map(i->i.getKey()).findFirst();
		if(nonrepeat.isPresent()) {
			System.out.println(nonrepeat.get());
		}
	}

}
