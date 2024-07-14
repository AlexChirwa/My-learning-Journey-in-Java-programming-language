/* Date: 7.14.2024
 * Author: Chirwa Alex Joshua
 * Topic: Java Methods
 */

// declare and initialize
public class methods3{
	static void myMethod(String fname, int age) {
		System.out.println(fname + " is " + age);
	}
	// call method
	public static void main(String[] args) {
		myMethod("Alex", 23);
		myMethod("Taonga", 19);
		myMethod("Tawanda", 16);
		
	// we can add as many parameters as possible and can be separated by commas
	// when calling the method arguments must follow the exact order of the parameters
	}
}
