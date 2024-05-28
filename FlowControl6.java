// Date: 5.28.24

/* Java Nested loops:
 * - it is placing a loop inside another loop which is called nested loop.
 * - The "inner loop" will be executed one time for each iteration of the "out loop"
 * 
 */

public class FlowControl6{
	public static void main(String[] args) {
		
		// Example of a nested loop 
		
		// Outer-loop
		for(int i = 0; i <= 2; i++) {
			System.out.println("Outer: " + i); // Executes 2 times 
		
		// Inner-loop
		for(int t = 1; t <= 3; t++) {
			System.out.println("Inner: " + t); // Executes 6 times (2 * 3)
		  }
	   }
		
	}
}