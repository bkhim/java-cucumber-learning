// here, each class instance has it's own copy of instance variable
public class InstanceVariable {
	   String myInstanceVar="this is the instance variable";
	   
	   public static void main(String[] args) {
		   InstanceVariable obj = new InstanceVariable();
		   InstanceVariable obj2 = new InstanceVariable();
		   InstanceVariable obj3 = new InstanceVariable();
		   
		   System.out.println(obj.myInstanceVar);
		   System.out.println(obj2.myInstanceVar);
		   System.out.println(obj3.myInstanceVar);
		   
		   // change it using obj2
		   obj2.myInstanceVar = "Change instance variable";
		   
		   // the output now
		   System.out.println(obj.myInstanceVar);
		   System.out.println(obj2.myInstanceVar); // only this will change
		   System.out.println(obj3.myInstanceVar);
		   
		   
	   }
}
