package ab;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class streams3 {
	public static void main(String[] args) {
		ArrayList<employee> a=new ArrayList<>();
		a.add(new employee("elee",25,30000));
		a.add(new employee("rishi",25,10000));
		a.add(new employee("dhoni",38,60000));
		a.add(new employee("kohli",35,50000));
		a.add(new employee("rohit",29,40000));
		
		List<employee> l=a.stream().filter(e->e.getSalary()>20000 && e.getAge()<30).collect(Collectors.toList());
		
		Optional<employee> e=a.stream().sorted(Comparator.comparingLong(employee::getSalary)
				.reversed()).skip(1).findFirst();
				
		System.out.println(l);
		
		System.out.println(e.get());
	}

}
