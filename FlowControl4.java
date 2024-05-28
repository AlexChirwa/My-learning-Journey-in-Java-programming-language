// Date: 5.27.2024

// do/while loop

/*
 * - The do-while loop is a variant of the while loop.
 * - This loop will execute the code block once, before checking if the condition is true,
 * then it will repeat the loop as long as the condition is true.
 * 
 * Syntax:
 * do{
 *  ** code block
 * }
 * while(condition);
 */

public class ConditionalStatements4{
	public static void main(String[] args) {
		
		// Example of do-while loop
		
		// create variables
		int i = 0;
		
		// do-while loop
		do {
			System.out.println(i);
			i++;
		}
		while(i < 5);

/* The loop will always be executed at least once, even if the condition is false, 
 * because the code block is executed before the condition is tested.
 */
	}
}
