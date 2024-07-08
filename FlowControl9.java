/* Date: 7.8.2024
 * Author: Chirwa Alex Joshua
 * Continue Statements 
 */


public class FlowControl9{
	public static void main(String[] args) {
		
		/* Continue statement: 
		 * it breaks one iteration (in the loop) if a specified condition occurs
		 * and continues the next iteration in the loop.
		 * 
		 * Example: 4 is skipped in this for loop
		 */
		
		for(int i = 0; i < 10; i++) {
			if(i == 4) {
				continue;
			}
			System.out.print(i); // Output: 012356789
		}
	}
}