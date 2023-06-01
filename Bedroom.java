package Week3Evaluation;

public class Bedroom {
	
	public static String wall1;
	public static String wall2;
	public static String wall3;
	public static String wall4;
	public static Ceiling ceiling;
	public static Bed bed;
	public static Lamp lamp;
	
	public Bedroom(String wall1,String wall2, String wall3, String wall4, Ceiling ceiling,Bed bed,Lamp lamp ) {
		
		this.wall1=wall1;
		this.wall2=wall2;
		this.wall3=wall3;
		this.wall4=wall4;
		this.ceiling=ceiling;
		this.bed=bed;
		this.lamp=lamp;
	}
	
	public Bedroom(String string, Wall wall12, Wall wall22, Wall wall32, Wall wall42, Ceiling ceiling2, Bed bed2,
			Lamp lamp2) {
	}

	public static Lamp getLamp(Lamp lamp) {
		
		return lamp;
		
	} 
	
	
	
	public void makeBed() {
		
		System.out.println("Bedroom -> Making bed | ");
		
		Bed.make();
	}
	

	public static void main(String[] args) {
		
		Bedroom obj2 = new Bedroom(wall1, wall1, wall1, wall1, ceiling, bed, lamp);
		
		obj2.makeBed();
		
		Wall wall1 = new Wall("West");
		Wall wall2 = new Wall("East");
		Wall wall3 = new Wall("South");
		Wall wall4 = new Wall("North");
		 
		Ceiling ceiling = new Ceiling(12, 55);
		 
		Bed bed = new Bed("Modern", 4, 3, 2, 1);
		 
		Lamp lamp = new Lamp("Classic", false, 75);
		 
		Bedroom bedRoom = new Bedroom("YOUR NAME HERE", wall1, wall2, wall3, wall4, ceiling,bed, lamp);
		
		bedRoom.makeBed();
		
		bedRoom.getLamp(lamp).turnOn();


	}

}
