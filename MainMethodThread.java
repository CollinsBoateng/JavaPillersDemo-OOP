package Week3Evaluation;

public class MainMethodThread {

	public static void main(String[] args) {

		
		//-------------------------------------------


		ThreadEven thread = new ThreadEven();
		
		thread.setName("Even Numbers Thread");

		
		thread.start();
		try {
			thread.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//-------------------------------------------


		ThreadOdd thread2 = new ThreadOdd();
		
		thread2.setName("Odd Numbers Thread");

		thread2.start();
	}

}
