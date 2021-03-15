// local variables are limited to the class method only
public class LocalVariable {
	// instance variable (static)
	public String myVar="instance variable";
	
	public void myMethod(){
    	// local variable
    	String myVar = "Inside Method";
    	System.out.println(myVar);
   }
	
	public static void main(String args[]){
	      // Creating object
		LocalVariable obj = new LocalVariable();
	    	
	      /* We are calling the method, that changes the 
	       * value of myVar. We are displaying myVar again after 
	       * the method call, to demonstrate that the local 
	       * variable scope is limited to the method itself.
	       */
	      System.out.println("Calling Method");
	      obj.myMethod();
	      System.out.println(obj.myVar);
	   }
}

//If I hadn’t declared the instance variable and only declared the local variable inside method then 
// the statement System.out.println(obj.myVar); would have thrown compilation error. 
// As you cannot change and access local variables outside the method.