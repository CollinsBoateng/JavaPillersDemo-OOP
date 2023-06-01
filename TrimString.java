package Review;

public class TrimString {
	
	public static void trimString(String x) {
		
		System.out.println(x.replaceAll("\s" , ""));
		
	}

	public static void main(String[] args) {

		trimString("Hello World");
	}

}
