package Week3Evaluation;

public class CounterMain {

	public static void main(String[] args) {
		Counter obj = new Counter();

		CounterThread thread = new CounterThread(obj);

		thread.start();

		/////////////////////////////////////////////////////////


		CounterThread thread02 = new CounterThread(obj);

		thread02.start();
		/////////////////////////////////////////////////////////
		
		
		CounterThread thread03 = new CounterThread(obj);
		
		thread03.start();
	}

}
