package ab;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class streams1 {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(5);
		a.add(58);
		a.add(85);
		a.add(34);
		a.add(29);
		a.add(93);
		
		int largest=a.stream().sorted().collect(Collectors.toList()).get(a.size()-2);
		System.out.println(largest);
	}

}
