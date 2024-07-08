/* Date: 7.8.2024
 * Author: Chirwa Alex Joshua
 * Break Statements 
 */

public class FlowControl10{
	public static void main(String[] args) {
		// the use of Break statements in a while loop
		
		// Variable initialization
		int i = 0;
		
		// the loop stops when i is equal to 4
		while (i < 10) {
			System.out.print(i); // Output: 0123
			i++;
			if (i == 4) {
				break;
			}
		}
	}
}

