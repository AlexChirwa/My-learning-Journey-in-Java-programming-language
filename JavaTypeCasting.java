

public class JavaTypeCasting{
	public static void main(String[] args) {
		
		/*Java Type Casting:
    	 * it is the assigning of a value of a primitive type to another type ( in other words the conversion of the assigned value of a primitive type to another type)
    	 * 
    	 * Two type of casting: Widening casting(Automatically) and Narrowing casting(Manually)
    	 * 
    	 * Widening casting is we pass a value of a smaller type to a larger type. Eg byte -> short -> char etc
    	 * 
    	 * Narrowing casting is the passing of a value of a larger type to a smaller type. Eg double -> float -> long -> int etc.
    	 */
    	
    	// Example of a Widening Casting:
    	
    	int myInt = 4;
    	double myDouble = myInt; // Automatic casting: int to double 
    	
    	System.out.println(myInt); // Output: 4
    	System.out.println(myDouble); // Output: 4.0
    	
    	
    	// Example of Narrowing Casting:
    	// in Narrowing Casting it must be done manually by placing the 'type' in parentheses () in front of the value:
    	
    	double num = 9.78d;
    	int n = (int) num; // Manual Casting: double to int
    	
    	System.out.println(num); // Output: 9.78
    	System.out.println(n); // Output: 9
	}
}