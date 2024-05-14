
// Java data types lesson 

public class DataTypes{
	public static void main(String[] args) {
		
        /* Java Numbers (Based on Integer types in Java)*/
    	
    	/* Byte type: since a byte only store numbers from -128 to 127.
    	 * We can use byte type if we are certain that the values that will be stored
    	 * will be within the range of -128 to 127
    	 * Example below:
    	 */
    	
    	// Create the variable 
    	byte myNum = 100;
    	byte num = 127;
    	
    	// Print the variable
    	
    	System.out.println(myNum);
    	System.out.println(num);
    	
    	
    	// Short data type: only stores whole numbers ranging from -32678 to 32767. 
    	
    	// Create the variable 
    	
    	short s = 7000;
    	
    	// Print variable 
    	
    	System.out.println(s);
    	
    	
    	/* Int data type: only stores whole numbers ranging from -2147483648 to 2147483647. 
    	 * it is the most ideal data type when your are creating variable with a numeric value.
    	 */
    	
    	// Create the variable 
    	
    	int x = 2147483647;
    	
    	// Print variable
    	
    	System.out.printf("%,d%n", x); // if we want to print a specified format we use 'printf' and the format before the variable
    	
    	
    	/* Long data type: can store whole numbers from
    	 * -9223372036854775808 to 9223372036854775807.
    	 * it is only used when the int data type isn't enough to store the values.
    	 * Note: We should end the value with an "L".
    	 */
    	
    	// Create the variable
    	long n = 9223372036854775807L;
    	
    	// Print variable 
    	
    	System.out.printf("%,d%n", n);
    	
    	
	}
}