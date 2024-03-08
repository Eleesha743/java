package ab;

import java.util.Arrays;

public class anagram {
	public static void main(String[] args) {
		String s1="race";
		String s2="car";
		String str1=s1.toLowerCase();
		String str2=s2.toLowerCase();
		char[] chars1=str1.toCharArray();
		char[] chars2=str2.toCharArray();
		Arrays.sort(chars2);
		Arrays.sort(chars1);
		
		System.out.println(Arrays.equals(chars1, chars2));
		
	}

}
