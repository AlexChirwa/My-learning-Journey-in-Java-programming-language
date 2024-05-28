// Date: 5.28.24

/* Java For-loop
 * 
 * A for-loop is when you know exactly how many times you want to loop through a block of code.
 * 
 * Syntax:
 * for(Statement1; Statement2; Statement3){
 *     **code block to be executed
 *}
 *
 * - Statement1 -> is executed(one time) before the execution of code block. (Variable creation)
 * - Statement2 -> defines the condition for executing the code block. (Condition)
 * - Statement3 -> is executed (every time) after the code block has been executed. 
 * (extra code block to keep the loop going till the condition is met)
 */

public class FlowControl5{
	public static void main(String[] args) {
		
		// Example of a for loop
		for(int i = 0; i <= 5; i++) {
			System.out.println(i); // Output: 0, 1, 2, 3, 4, 5
		}
	}
}