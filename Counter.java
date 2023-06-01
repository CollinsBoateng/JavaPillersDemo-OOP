package Week3Evaluation;

public class Counter {

	private static int c = 0;

	public synchronized void increment() {

		for (int i = 0; i < 5; i++) {

			System.out.println(c++);
		}
		try {
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName());
		} catch (Exception e) {
			System.out.println(e);
		}

	}


	public synchronized void decrement() {
		for (int i = 0; i < 5; i++) {

			System.out.println(c--);
		}
		try {
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName());
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static synchronized int value() {
		System.out.println(c);
		return c;

	}
}
