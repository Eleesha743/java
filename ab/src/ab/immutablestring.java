package ab;

public class immutablestring {
	public static void main(String[] args) {
		String s="rishi";
		String s2=s.concat("sri");
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
	}
	
//	public static void main(String[] args) {
//		StringBuffer sb=new StringBuffer("rishi");
//		StringBuffer s2= sb.append("sri");
//		System.out.println(sb.hashCode());
//		System.out.println(s2.hashCode());
//	}

}
