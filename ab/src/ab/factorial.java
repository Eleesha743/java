package ab;

public class factorial {
	public static void main(String[] args) {
		long factorial=fact(4);
		System.out.println(factorial);
	}
	
	public static long fact(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		else {
			return n*fact(n-1);
		}
	}

}
