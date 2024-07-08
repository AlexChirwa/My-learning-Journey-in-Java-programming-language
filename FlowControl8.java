/* Date: 7.8.2024
 * Author: Chirwa Alex Joshua
 * Break Statements 
 */


public class FlowControl8{
	public static void main(String[] args) {
		
		/* Break Statements: it enables you to jump out of a switch statement
		 * but in this case we'll look at how it also enables us to jump out of a for loop
		 * 
		 * Example: the loop stops when i is equal to 4:
		 */
		
		for(int i = 0; i < 10; i++) {
			if(i == 4) {
				break;
			}
			System.out.print(i); // Output: 0123
		}
	}
}