
// In java math we have many Math methods that help us tackle mathematical tasks on numbers

public class JavaMath{
	public static void main(String[] args) {
		
		/* Math.max()method:
		 * is used to find the maximum value between two or more values
		 * 
		 * General form:
		 * data type variableName = Math.max(x, y);
		 */
		
		// Create Variables 
		int num1 = 9, num2 = 10;
		
		// assign the Math.max() method
		int max = Math.max(num1, num2);
		System.out.println("Maximum value: " + max); // Output: 10 
		
		///////////////////////////////////////////////////////////////////
		
		/* Math.min() method:
		 * it is used to find the minimum value of two or more values
		 * 
		 * general form:
		 * data type variableName = Math.min(x, y); 
		 */
		
		// Create variables
		int x = 10, y = 20;
		
		// use the Math.min()method and print to the console 
		int min = Math.min(x, y);
		System.out.println("Minimum value: " + min); // Output: 10
		
		///////////////////////////////////////////////////////////////////
		
		/* Math.sqrt() method:
		 * this method is used to find out the square root of a value 
		 * 
		 * general form:
		 * data type variableName = Math.sqrt(value/variable);
		 */
		
		// Create variables
		int myInt = 20;
		
		// use the Math.sqr() method and print to the console 
		double squareRoot = Math.sqrt(myInt); // to the square root we need to have the value converted to the type double
		System.out.println("The square root of 20: " + squareRoot); // Output 4.47213595499958
		
		//////////////////////////////////////////////////////////////////////////
		
		/* Math.abs() method:
		 * this method returns the absolute(positive) value
		 * 
		 * general form:
		 * data type variableName = Math.abs(value/variable);
		 */
		
		// Create variables 
		double myDouble = -4.0;
		
		// use the Math.abs() method and print to the console 
		double absolute = Math.abs(myDouble);
		System.out.println("Absolute value: " + absolute); // Output: 4.0
		
		
		///////////////////////////////////////////////////////////////////////
		
		/* Random numbers - Math.random() method:
		 * this method returns a numbers between 0.0 and 1.0.
		 * to gain control over the random numbers we need to use narrowing casting 
		 * 
		 * general form:
		 * data type variableName = Math.random(value/variable)
		 * 
		 * other form with the use of type casting:
		 * data type variableName = (data type)(Math.random(value/variable)*limit range)
		 * example limit range is 100 so we use 101.
		 */
		
		// without giving the range 
		double randomNumbers = Math.random();
		System.out.println("Random number: " + randomNumbers); // Output: 0.37240853926880335
		
		// gaining control by providing the range
		int random = (int)(Math.random()*11);
		System.out.println("Random number ranging from 0 to 10: " + random); // Output: 2
		
				
	}
}