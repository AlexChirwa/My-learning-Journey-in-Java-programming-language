
// Logical Operators:
/* In logical operators you can also test for true or false
 * values
 */

public class Operators4{
	public static void main(String[] args) {
		

    	// Logical and operator (&&): it returns true if both statements are true.
    	int x = 5, y = 10;
    	boolean logicalAnd = x > y && x != y;
    	
    	System.out.println(logicalAnd); // Output: false
    	
    	
    	// Logical Or operator (||): return true if one of the statements is true. 
    	int a = 5, b = 10;
    	boolean logicalOr = a > b || a != b;
    	
    	System.out.println(logicalOr); // Output: true
    	
    	
    	// Logical Not operator (!): returns false if the result is true and vice versa.
    	int f = 2, g = 4;
    	boolean logicalNot = !(f == g && f > g); 
    	boolean logicalNot2 = !(f < g || f == g);  
    	
    	System.out.println(logicalNot); // Output: true
    	System.out.println(logicalNot2); // Output: false
    	

	}
}