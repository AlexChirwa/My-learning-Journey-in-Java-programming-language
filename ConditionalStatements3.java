// Date: 5.27.2024

// While loop

/*
 * Loops:
 * - loops can execute a block of code as long as a specified condition is reached.
 * - loops are handy because they save time, reduce errors, and they make code more readable.
 * 
 * While loop:
 * - The "while loop" loops through a block of code as long as a specified condition is true:
 * 
 * Syntax:
 * while(condition){
 *     **code block
 * }
 */

public class ConditionalStatements3{
	public static void main(String[] args) {
		
		// Example of a while loop
		
		// create variables 
		int i = 0;
		
		// while loop 
		while(i < 5) {
			System.out.println(i);
			i++;
		}
		
		// Do not forget to increase the variable used in the condition, otherwise the loop will never end.
	}
}