package Week3Evaluation;

import java.util.Scanner;

public class ThreadEven extends Thread {

	@Override
	public void run() {
		System.out.println("Please enter an even integer: ");
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		System.out.println("-------------------------");
		for (int i = 1; i < 10; i++) {

			if (x % 2 == 0) {

				System.out.println(x);
				x++;
				x++;
			} else {
				System.out.println("Sorry, your number is odd!");
				break;
			}
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName());
			} catch (Exception e) {
				System.out.println(e);
			}

		}

	}
}
