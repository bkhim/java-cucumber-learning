package Lesson2;

// interface is a completely "abstract class" that is used to group related methods with empty bodies
// interfaces have similar characteristics to abstract classes
// a class can inherit from multiple interfaces, differently from general JAVA classes

//creating my interface_1
interface Home {
	public void owner(); // interface method, (no body)

	public void security();
}

// interface_2
interface Person {
	public void name();
}

// castle implements the Home interface
class Castle implements Home, Person { // can extend multiple interfaces
	public void owner() {
		String name = "Prince Charming";
		System.out.println("The castle is owned by " + name);
	}

	public void security() {
		int level = 4;
		System.out.println("The security level for access is " + level);
	}

	// method from second interface
	public void name() {
		System.out.println("Acapella Villa");
	}
}

public class Interfaces {
	public static void main(String[] args) {
		// creating instance of our sub-class (can't instantiate interfaces)
		Castle obj1 = new Castle();

		// accessing the methods, note they are all accessible from here
		obj1.name();
		obj1.owner();
		obj1.security();
	}
}
