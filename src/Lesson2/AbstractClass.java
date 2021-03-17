package Lesson2;
// abstract classes just declare methods, they are in turn implemented later ( same as PHP)

// declaring my methods here
abstract class FarmOne { // prefixed with 'abstract'
	public abstract void animals(); // no body for abstract method

	public abstract void animalFood();

	// here we don't have the 'abstract' in the method name, so we have a body for
	// the method
	public void grazingSpaces() {
		System.out.println("Only one grazing area is available");
	};
}

// implementing the abstract methods above
// you have to implement all the abstract methods from the parent class to avoid errors
class FarmOneImplement extends FarmOne {
	public void animals() {
		System.out.println("The animals present in our farm");
	}

	public void animalFood() {
		System.out.println("We have losts of animal food here too");
	}
}

// run everything
public class AbstractClass {
	public static void main(String[] args) {
		// FarmOne obj1 = new FarmOne(); // can't instantiate an abstract class this way
		// we create an instance of the implementing class
		FarmOneImplement obj1 = new FarmOneImplement();
		obj1.animalFood();
		obj1.animals();
	}
}
