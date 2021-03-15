
public class Operators {
	public static void main(String args[]) {
	      int num1 = 100;
	      int num2 = 21;

	      System.out.println("num1 + num2: " + (num1 + num2) );
	      System.out.println("num1 - num2: " + (num1 - num2) );
	      System.out.println("num1 * num2: " + (num1 * num2) ); 
	      System.out.println("num1 / num2: " + (num1 / num2) );
	      System.out.println("num1 % num2: " + (num1 % num2) );
	      
	      // assignment operators
	      num2 = num1;
	      System.out.println("= Output: "+num2);

	      num2 += num1;
	      System.out.println("+= Output: "+num2);
		      
	      num2 -= num1;
	      System.out.println("-= Output: "+num2);
		      
	      num2 *= num1;
	      System.out.println("*= Output: "+num2);
		      
	      num2 /= num1;
	      System.out.println("/= Output: "+num2);
		      
	      num2 %= num1;
	      System.out.println("%= Output: "+num2);
	      
	      // decrement/increment
	      num1++;
	      num2--;
	      System.out.println("num1++ is: "+num1);
	      System.out.println("num2-- is: "+num2);
	      
	      // logical operators
	      boolean b1 = true;
	      boolean b2 = false;

	      System.out.println("b1 && b2: " + (b1&&b2));
	      System.out.println("b1 || b2: " + (b1||b2));
	      System.out.println("!(b1 && b2): " + !(b1&&b2));
	      
	      // relational operators
	      if (num1==num2) {
	    		 System.out.println("num1 and num2 are equal");
	    	      }
	    	      else{
	    		 System.out.println("num1 and num2 are not equal");
	    	      }

	    	      if( num1 != num2 ){
	    		 System.out.println("num1 and num2 are not equal");
	    	      }
	    	      else{
	    		 System.out.println("num1 and num2 are equal");
	    	      }

	    	      if( num1 > num2 ){
	    		 System.out.println("num1 is greater than num2");
	    	      }
	    	      else{
	    		 System.out.println("num1 is not greater than num2");
	    	      }

	    	      if( num1 >= num2 ){
	    		 System.out.println("num1 is greater than or equal to num2");
	    	      }
	    	      else{
	    		 System.out.println("num1 is less than num2");
	    	      }

	    	      if( num1 < num2 ){
	    		 System.out.println("num1 is less than num2");
	    	      }
	    	      else{
	    		 System.out.println("num1 is not less than num2");
	    	      }

	    	      if( num1 <= num2){
	    		 System.out.println("num1 is less than or equal to num2");
	    	      }
	    	      else{
	    		 System.out.println("num1 is greater than num2");
	    	      }
	   }
}
