package Com.fistprogram;

//an abstract class can have abstract methods 
//and also regular method(concrete methods)
//you cannot instantiate a abstract class
//there must be a subclass who does all the implementation of abstract methods
//the concrete methods will be available to subclass based on the inheritance concept
public abstract class Abstraction {
	int a;
	int b;

	public Abstraction(int a2, int b2) {
		this.a = a2;
		this.b = b2;
		// TODO Auto-generated constructor stub
	}

	// if you have at least one method as abstract then your class has to be
	// abstract
	public abstract void add(int a, int b);

	public void subtract() {
		// local variable has be initialized with value before using it
		int a = 022; // octal representation of the decimal 18
		int b = 10;
		int sub = a - b;
		System.out.println(sub); // 18 - 10 = 8

	}
}
