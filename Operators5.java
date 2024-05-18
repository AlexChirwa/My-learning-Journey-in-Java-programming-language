
/* Unary Operators:
 * unary operators need only one operand.
 * They are used to increment, decrement or negate a value.
 */

public class Operators5{
	public static void main(String[] args) {
		
		// Create variables 
		int num1 = 5, num2 = 3;
		int sub = num1 - num2; // Unary minus operator, used to negate a value 
		
		// Print variable
		System.out.println("Output: " + sub); // Output: 2
		
		//////////////////////////////////////////////////////////////////////////////////
		
		//Increment and Decrement a value 
		
		int a = 5;
		
		System.out.println("Pre-Increment: " + (++a)); // the Output is 6 cause the value has been incremented before computing the value of the result 
		System.out.println("pre-Decrement: " + (--a)); // the Output is 5 cause the value has been incremented before computing the value of the result 
		
		
		///////////////////////////////////////////////////////////////////////////////////
		
		// Post increment and decrement 
		
		int b = 8;
		
		System.out.println("Post-Increment: " + (b++)); // the Output is 8 cause the value has been, then incremented.
		System.out.println("Post-Decrement: " + (b--)); // the Output is 9 cause the value has been, then decremented.
	}
}