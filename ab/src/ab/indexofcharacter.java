package ab;

import java.util.HashMap;

public class indexofcharacter {
	public static void main(String[] args) {
		String name="rishi";
		HashMap<Character,Integer> h=new HashMap<>();
		for(int i=0;i<name.length();i++) {
			char c=name.charAt(i);
			h.put(c, i);
		}
		int index=h.get('s');
		System.out.println(index);
	}

}
