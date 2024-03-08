package ab;

public class fibonocci {
	public static void main(String[] args) {
		
		int f1=0,f2=1,n=10;
		for(int i=1;i<=n;i++) {
			System.out.println(f1+"");
			int fn=f1+f2;
			f1=f2;
			f2=fn;
		}
		
		
	}

}
