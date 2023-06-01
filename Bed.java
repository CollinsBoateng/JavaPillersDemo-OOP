package Week3Evaluation;

public class Bed {

	private String style;
	private int pillows;
	private int height;
	private int sheets;
	private int quilt;

	public Bed(String style, int pillows, int height, int sheets, int quilt) {
		this.style = style;
		this.pillows = pillows;
		this.height = height;
		this.sheets = sheets;
		this.quilt = quilt;

	}

	public static void make() {
		System.out.println("Bed -> Making | ");

	}

	public static String getStyle(String style) {

		System.out.println("The style is: " + style);
		return style;

	}

	public static int getPillows(int pillows) {

		System.out.println("The number of pillows is: " + pillows);
		return pillows;

	}

	public static int getHeight(int height) {

		System.out.println("The height is: " + height);
		return height;

	}

	public static int getSheets(int sheets) {

		System.out.println("The number of sheets is: " + sheets);
		return sheets;

	}

	public static int getQuilt(int quilt) {

		System.out.println("The value of quilt is: " + quilt);
		return quilt;

	}

	public static void main(String[] args) {
		
		make();
		getStyle("Antique");
		getPillows(4);
		getHeight(12);
		getSheets(3);
		getQuilt(2);
		
		
		
	}

}
