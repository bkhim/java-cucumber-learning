package assignment;

// the main class
class Operations {
	// I use static methods to access them from sub-class
	void add(int one, int two) {
		System.out.println("Adding " + one + " and " + two +" = " + one+two);
	}
	
	void sub(int one, int two) {
		System.out.println("Subtracting " + one + " and " + two +" = " + (one-two));
	}
	
	static void multiply(int one, int two) {
		System.out.println("Product of " + one + " and " + two +" = " + one*two);
	}
}

// sub class, inherits from the main class
class Inheritor extends Operations {
	static int one = 21;
	static int two = 12;
	
	public static void main(String[] args) {
		// create the Operations object
		Operations operation = new Operations();
		
		// call the add method from parent (statically)
		operation.add(one, two);
		
		// call the sub method (statically)
		operation.sub(one, two);
		
		// calling the product method
		// since the parent method is not static from the parent, 
		// here I access it using the parent Class
		Operations.multiply(one, two);
	}
}
