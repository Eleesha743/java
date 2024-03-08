package ab;

public class reversestring {
//	public static void main(String[] args) {
//		String s="rishi";
//		String sr="";
//		for(int i=s.length()-1;i>=0;i--) {
//			sr+=s.charAt(i);
//		}
//	  System.out.println(sr);
//	}
	
    public static void main(String[] args) {
		String s="rishi";
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		String s2=sb.toString();
		System.out.println(s2);
	}
}
	
	


