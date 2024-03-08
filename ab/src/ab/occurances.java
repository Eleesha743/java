package ab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class occurances {
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("elee");
		a.add("dhoni");
		a.add("elee");
		a.add("dhoni");
		a.add("dhoni");
		a.add("kohli");
		a.add("rohit");
		
		HashMap<String,Integer> m=new HashMap<>();
		for(String i:a) {
			m.put(i, m.getOrDefault(i, 0)+1);
		}
		for(Map.Entry<String, Integer> entry:m.entrySet()) {
			if(entry.getValue()==3) {
				System.out.println(entry.getKey()+"--"+entry.getValue());
			}
		}
	}

}
