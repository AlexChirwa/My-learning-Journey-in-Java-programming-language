/* Date: 7.14.2024
 * Author: Chirwa Alex Joshua
 * Topic: Java Methods
 * 
 * in the code below:
 * parameter is fname
 * arguments Alex, Taonga
 */

// declare and initialize
public class methods2{
	static void myMethod(String fname) {
		System.out.println(fname + " Chirwa");
	}
	//calling the method
	public static void main(String[] args) {
		myMethod("Alex"); // Argument - Alex
		myMethod("Taonga"); // Argument - Taonga 
		myMethod("Tawanda"); // Argument - Tawanda
		
		/* Output:
		 * Alex Chirwa
		 * Taonga Chirwa
		 * Tawanda Chirwa
		 */
	}
}