
public class Variables2{
	public static void main(String[] args) {
		
		/* this is based on Variables and data types 
		 * this snippet of code is based on formatting output in Java 
    	 * so in this code below it specifies the formatting output of an integer
    	 */ 
    	int Num = 10000;
    	System.out.printf("The value of num is: %,d%n", Num); // Output is 10,000	
		
    	// displaying both text and a variable in the console 
    	String name = "Alex";
    	System.out.println("hello " + name); // Output: hello Alex
    	
    	/*combining two variables*/
    	String firstName = "Alex ";
    	String lastName = "Chirwa";
    	String fullName = firstName + lastName;
    	System.out.println(fullName); // Output: Alex Chirwa
    	
    	
    	/* in this case we use + character as mathematical operator 
    	 * to add two or more values together as compared to strings 
    	 */
    	int a = 10;
    	int b = 3;
    	System.out.println(a + b); // Output: 13
    	
    	
    	// declaring multiple variables of the same data type we use a comma-separated list
    	
    	/*instead of this below:
    	int x = 1;
    	int y = 2;
    	int z = 4;
    	*/
    	
    	//we use this below:
    	int num1 = 1, num2 = 2, num3 = 4;
    	System.out.println(num1 + num2 + num3); //Output: 6
    	
    	
    	//we can also assign a value to multiple variables:
    	int x, y, z;
    	x = y = z = 50;
    	System.out.println(x + y + z); // Output: 150
    	
	}
}