package Week3Evaluation;

public class Ceiling {

	public int height;
	public int paintedColor;

	public Ceiling(int height, int paintedColor) {
		this.height = height;
		this.paintedColor = paintedColor;

	}

	public static int getHeight(int height) {
		System.out.println("The height is: " + height);
		return height;

	}

	public static int getPaintedColor(int paintedColor) {
		System.out.println("The painted color is: " + paintedColor);
		return paintedColor;

	}

	public static void main(String[] args) {

		getHeight(50);
		getPaintedColor(888);
	}

}
