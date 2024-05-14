
public class Variables{
	public static void main(String[] args) {
		
		//Types of Variables(String, int, float, char and boolean)
		
		/* Creating a variable String */
		String name = "Ben";
		System.out.println(name); // Output: Ben
		
		/*Creating a Variable int*/
		int x = 15;
		System.out.println(x); // Output: 15
		
		/* We can also declare a variable without assigning the value,
		 * and assign the  value later
		 */
		int myNum;
		myNum = 15;
		System.out.println(myNum); // Output: 15
		
		//overwriting the previous value assigned to the variable
		int y = 15;
		y = 20; // myNum is now 20 
		System.out.println(y); // Output: 20
		
		/* Final Variables - helps you not to overwrite existing values by using the keyword 'final' which will declare the variable as final or constant 
		 which means unchangeable and read-only */
		final int z = 10;
		z = 15;
		System.out.println(z); // it will generate an error: variableName cannot be assigned.
		
    	
	}
}