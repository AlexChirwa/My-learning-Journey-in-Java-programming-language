
/* Ternary operator:
 * the ternary operator is a shorthand version of the if-else statement.
 * it has three operands and hence the name Ternary.
 * 
 * The general format is:
 * Condition ? if true : if false
 * 
 * the above statement means that if the condition is evaluated as true, 
 * then execute the statement after (?) else execute the statement after the (:).
 */

public class Operator6{
	public static void main(String[] args) {
		
		// Create variables
		int x = 2, y = 3, z = 4, result;
		
		
		result = ((x > y ) ? ( x > z) ? x : z : (y > z) ? y : z );   
		
		System.out.println("The largest number: " + result); // Output is 4
	}
}

/* The statement above is a condition that if x is less than y we print the result 
 * other wise we compare x and z  
 * Lastly y and z 
 */
