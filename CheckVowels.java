package Review;

import java.util.List;

public class CheckVowels {
	
	public static void checkVowels(String x) {
		
		char[] str = x.toCharArray();
		
		for(int i=0; i<str.length; i++ ) {
			
			if(str[i]== 'a' ) {
				System.out.println(str[i] + " is a vowel");
			}
			if(str[i]== 'e' ) {
				System.out.println(str[i]+ " is a vowel");
			}
			if(str[i]== 'i' ) {
				System.out.println(str[i]+ " is a vowel");
			}
			if(str[i]== 'o' ) {
				System.out.println(str[i]+ " is a vowel");
			}
			if(str[i]== 'u' ) {
				System.out.println(str[i]+ " is a vowel");
			}
			
		}
		
	}

	public static void main(String[] args) {
		
		checkVowels("HelloWorld");
		// TODO Auto-generated method stub

	}

}
