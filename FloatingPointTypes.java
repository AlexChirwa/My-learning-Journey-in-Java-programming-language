
/* Floating point types (Based on the above lesson) */

public class FloatingPointTypes {
	public static void main(String[] args) {
		    	
    	/* in the floating point types we have two valid types, Float and Double.
    	 * we know these types store values with a decimal point.
    	 * we should always add at the end of a value the respectful letters:
    	 * 'f' for float and 'd' for double
    	 */
    	
    	// Create the variables
    	
    	float myFloat = 5.89f;
    	double myDouble = 12.123d;
    	
    	// Print variable
    	
    	System.out.println(myFloat);
    	System.out.println(myDouble);
    	
    	
    	/*Scientific numbers: is a floating point number which can also be a scientific number
    	 * with a letter 'e' to indicate the power 10.
    	 */
    	
    	// Create the variables 
    	
    	float f1 = 35e3f; // the value is represents 35 * 10 three times, and since it is a Floating point type it has a decimal point 
    	double d1 = 12E4d; // same applies to this value were 12 is being multiplied by 10 four times 
    	
    	// Print variable 
    	System.out.println(f1);
    	System.out.println(d1);
    	// output: 35000.0 and 120000.0
    	
	}
}