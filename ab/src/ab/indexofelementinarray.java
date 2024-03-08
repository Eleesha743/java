package ab;

public class indexofelementinarray {
	public static void main(String[] args) {
		int a[]= {6,3,7,8,9,2};
		System.out.println(findindex(a,7));
		
	}
	
	public static int findindex(int arr[],int x) {
		
		if(arr==null) {
			return -1;
		}
		
		int i=0;
		while(i<arr.length) {
			if(arr[i]==x) {
				return i;
			}
			else {
				i=i+1;
			}
		}
	 return -1;
		
	}

}
