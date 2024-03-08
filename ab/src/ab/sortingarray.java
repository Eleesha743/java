package ab;

import java.util.Arrays;

public class sortingarray {
	public static void main(String[] args) {
		int[] ar= {8,5,9,20,2};
		Arrays.sort(ar);
		for(int i=ar.length-1;i>=0;i--) {
			System.out.println(ar[i]);
		}
	}

}
