/* Date: 7.14.2024
 * Author: Chirwa Alex Joshua
 * Topic: Java Methods
 * 
 * What is a method in java:
 * A method is block of code which runs when it is called.
 * You can also pass data in a method known as parameters.
 * we pass parameters in parentheses() after the method name.
 */


// declare a method
public class methods{
	/* Static - means the method belongs to the Main class in this case 'methods'.
	 * void - means that the method does not have a return value.
	 */
	static void myMethod() {
		System.out.println("you have succefully executed a method");
	}
	// calling a method
	public static void main(String[] args) {
		myMethod();  
	}
}


