package assignment;

// the main class
class Operations {
	void add(int one, int two) {
		System.out.println("Adding " + one + " and " + two +" = " + one+two);
	}
	
	void sub(int one, int two) {
		System.out.println("Subtracting " + one + " and " + two +" = " + (one-two));
	}
	
	void multiply(int one, int two) {
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
		
		// call the add method from parent
		operation.add(one, two);
		
		// call the sub method
		operation.sub(one, two);
		
		// calling the product method
		operation.multiply(one, two);
		
		
	}
}
