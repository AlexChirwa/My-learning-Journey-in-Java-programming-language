/* Date: 7.8.2024
 * Author: Chirwa Alex Joshua
 * Continue Statements 
 */


public class FlowControl11{
	public static void main(String[] args) {
		// the use of Break statements in a while loop
		
		// Variable initialization
		int i = 0;
		
		// the loop skips 4 when i is equal to 4
		while (i < 10) {
			if (i == 4) {
				i++;
				continue;
			}
			System.out.print(i);
			i++;
		}
	}
}