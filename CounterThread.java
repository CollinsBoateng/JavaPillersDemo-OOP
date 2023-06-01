package Week3Evaluation;

public class CounterThread extends Thread {
	Counter x;
	
	public CounterThread(Counter x) {
		this.x=x;
		
	}
		@Override
	public void run() {
		x.increment();
		
		
	}

}
