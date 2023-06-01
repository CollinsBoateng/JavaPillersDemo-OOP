package Week3Evaluation;

public class Lamp {
	
	private String style;
	
	private boolean battery;
	
	private  int globRating;
	
	public Lamp(String style, boolean battery, int globRating) {
		this.style=style;
		this.battery=battery;
		this.globRating=globRating;
	}
	
	public static void turnOn() {
		
		System.out.println("Lamp -> Turning on");
	}
	
	public static String getStyle(String style) {
			
			System.out.println("The Lamp style is: " + style);
			
		return style;
		
	}
	
	public static boolean isBattery(boolean battery) {
		
		System.out.println("The value of battery is: " + battery);
		return battery;
		
	}
	
	public static int getGlobRating(int globRating) {
		
		System.out.println("The globRating is: " +  globRating);
		return globRating;
		
	}
	
	
	

	public static void main(String[] args) {
		
		turnOn();
		getStyle("Bright");
		isBattery(true);
		getGlobRating(90);
		
		
		
	}

}
