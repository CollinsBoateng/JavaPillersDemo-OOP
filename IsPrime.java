package Review;

public class IsPrime {

	public static void isPrime(int x) {
		if (x == 0 || x == 1 ) {
			System.out.println("Is not Prime");
		}else {
			for (int i = 2; i < x; i++) {

				if (x % i != 0) {
					System.out.println("Is not Prime");
				}else if(x/i==1) {
					System.out.println("Is Prime");
					
				}

			}
		}

	}

	public static void main(String[] args) {

		isPrime(9);
	}

}
