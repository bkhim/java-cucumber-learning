package Lesson2;

// a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit

class Encaps {
	// some sensitive variables
	private String cardNo;
	private String idNo;
	private int age;

	// use getter and setters for the above
	public int getAge() {
		return age;
	}

	public String getName() {
		return cardNo;
	}

	public String getIdNum() {
		return idNo;
	}

	public void setAge(int newAge) {
		age = newAge;
	}

	public void setName(String newName) {
		cardNo = newName;
	}

	public void setIdNum(String newId) {
		idNo = newId;
	}
}

// running the code above
public class Encapsulation {
	public static void main(String[] args) {
		Encaps obj1 = new Encaps();

		obj1.setAge(14);
		obj1.setIdNum("22222");
		obj1.setName("Blancos Khim");

		System.out.print("Name : " + obj1.getName() + "\nAge  : " + obj1.getAge());

	}
}
