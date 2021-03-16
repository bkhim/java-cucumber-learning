package package1;

class FarmOne {  // superclass
	String foodName = "Dairy meal";
	public void food(String name) {
		System.out.println("superclass " + foodName);
	}
}

class FarmTwo extends FarmOne { // subclass
	String foodName = "Freshers strong";
	@Override
	public void food(String name) {
		// using super keyword
		super.food("By super method");
		
		System.out.println("subclass " + name);
	}
}

public class MethodOveriding {
	public static void main(String[] args) {
		FarmTwo obj1 = new FarmTwo();
		obj1.food("Bran");
	}
}
