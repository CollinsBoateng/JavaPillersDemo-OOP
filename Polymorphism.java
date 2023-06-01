package Com.fistprogram;


//Polymorphism is one  having different forms!

/*TYPES:
 * -Static polymorphism
 * -Method overloading
 * */

public class Polymorphism {
	public void print() {
		System.out.println("empty");
	}

	public void print(int a) {
		System.out.println("int");
	}

	public void print(double a) {
		System.out.println("double");
	}

	public void print(String a) {
		System.out.println("String");
	}

	public void print(double a, String str) {
		System.out.println("double and string");
	}

	public void print(String str, double a) {
		System.out.println("string and double");
	}

	public void print(double a, String str, int z) {
		System.out.println("double and string and int");
	}

	public static void main(String[] args) {
		Polymorphism d = new Polymorphism();
		d.print(); // empty
		d.print("hello"); // string
		d.print(100); // int
		d.print(34.234); // double
		d.print(3123.34, "udhegwy");// double string
		d.print("udhegwy", 3123.34); // string double
		d.print(3123.34, "udhegwy", 34); // double string int
	}

}