package assignment;

// import the Scanner module
import java.util.Scanner;

//the main class
class OperationsTwo {
	// I use static methods to access them from sub-class
	void add(int one, int two) {
		System.out.println("Adding " + one + " and " + two +" = " + one+two);
	}
	
	void sub(int one, int two) {
		System.out.println("Subtracting " + one + " and " + two +" = " + (one-two));
	}
	
	// non static method, see access type in sub-class
	static void multiply(int one, int two) {
		System.out.println("Product of " + one + " and " + two +" = " + one*two);
	}
}

//sub class, inherits from the main class
class InheritorTwo extends Operations {
	
	public static void main(String[] args) {
		int one, two;
		// create a scanner object
		Scanner input = new Scanner(System.in);
		
		// ask for the user input
	    System.out.println("Type a number:");
	    one = input.nextInt();  // read the user input
	    System.out.println("Type a second number:"); // number 2
	    two = input.nextInt();  // read the user input
		// create the Operations object
		OperationsTwo operation = new OperationsTwo();
		
		// call the add method from parent (statically)
		operation.add(one, two);
		
		// call the sub method (statically)
		operation.sub(one, two);
		
		// calling the product method
		// since the parent method is not static from the parent, 
		// here I access it using the parent Class
		OperationsTwo.multiply(one, two);
		
		
	}
}
