
// Comparison Operators: 
/* They are used to compare two values or variables. 
 * The return value of a comparison is either true or false (we will use the type boolean). 
 * This is important in programming, because it helps us to find answers
 * and make decisions.
 */

public class Operators3{
	public static void main(String[] args) {
		
		    	
    	// Equal to operator (==)
    	int x = 3, y = 3;
    	boolean equalTo = x == y;
    	
    	System.out.println(equalTo); // Output: true
    	
    	// Not equal operator (!=)
    	int r = 2, s = 3;
    	boolean notEqual = r != s;
    	
    	System.out.println(notEqual); // Output: true
    	
    	// Greater than operator (>)
    	int t = 10, p = 30;
    	boolean greaterThan = t > p;
    	
    	System.out.println(greaterThan); // Output: false
    	
    	// Less than operator (<)
    	int a = 10, b = 30;
    	boolean lessThan = a < b;
    	 
    	System.out.println(lessThan); // Output: true 
    	
    	// Greater than or equal to operator (>=)
    	int c = 10, d = 5;
    	boolean greaterOrEqual = c >= d;
    	
    	System.out.println(greaterOrEqual); // Output: true
    	
    	
    	// Less than or equal to operator (<=)
    	int f = 9, g = 8;
    	boolean lessOrEqual = f <= g;
    	
    	System.out.println(lessOrEqual); // Output: false
    	
    	
	}
}