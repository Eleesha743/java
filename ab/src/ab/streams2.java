package ab;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class streams2 {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(5);
		a.add(58);
		a.add(85);
		a.add(34);
		a.add(29);
		a.add(93);
		
		List<Integer> l=a.stream().filter(i->i>50).collect(Collectors.toList());
		System.out.println(l);
	}

}
