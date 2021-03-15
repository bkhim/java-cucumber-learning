//here, each class instance has same copy of instance variable
public class StaticVariable {
	public static String classVariable = "this is a class or static variable";
	
	public static void main(String[] args) {
		StaticVariable obj = new StaticVariable();
		StaticVariable obj2 = new StaticVariable();
		StaticVariable obj3 = new StaticVariable();
		
		// all three are similar
		System.out.println(obj.classVariable);
		System.out.println(obj2.classVariable);
		System.out.println(obj3.classVariable);
		
		// what about changing value of static variable using obj3
		obj3.classVariable = "Changed static value";
		
		// what's the output now
		System.out.println(obj.classVariable);
		System.out.println(obj2.classVariable);
		System.out.println(obj3.classVariable);
		
		// all the above similar to this
		System.out.println(classVariable);
	}
}
