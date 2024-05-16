
/* What we are trying to learn is how to accept user input
 * for the console in java, but for us to do that we need 
 * a package and a class that will allows to do so.
 */

// Firstly we will need to import a package called 
// java.util.Scanner (which comes with the className - Scanner)
// In java, Scanner is a class in java.util package used for obtaining
// the input of the primitive data types and String.
// Well for a start it will be good to know how the accepting user input works 
// but it is not ideal where time is a constraint.



//A code snippet to read data of various data types

// import package
import java.util.Scanner;

//using Scanner class
public class ScannerDemo{
	// main function
	public static void main(String[] args) {
		
		// Declare the object and initialize with 
		// predefined standard input object
		Scanner sc = new Scanner(System.in);
		
		// String input
		String name = sc.nextLine();
		
		// Character input 
		char gender = sc.next().charAt(0);
		
		// Numerical data input we can use byte,
		// short and float can be read using 
		// similar-named functions.
		int age = sc.nextInt();
		Long mobileNo = sc.nextLong();
		double cgpa = sc.nextDouble();
		boolean myBool = sc.nextBoolean();
		
		// Print the values to check if the input was 
		// correctly obtained 
		System.out.println("Name: " + name);
		System.out.println("Gender is: " + gender);
		System.out.println("Age is: " + age);
		System.out.println("Mobile No is: " + mobileNo);
		System.out.println("CGPA is: " + cgpa);
		System.out.println("Student is enrolled: " + myBool);
		
		/* Note That: 
		 * Sometimes, we have to check if the next value we read is of a certain type or if the input has ended.
		 * So then, we check if the Scanner's input is of the type we want with the help of hasNextXYZ() functions
		 * where XYZ is the type we are interested in.
		 * The function returns true if the Scanner has a token of that type, otherwise false.
		 * 
		 *  Now back to the main method, notice we used hasNextInt() to read int values
		 *  to check for a string, we use hasNextLine().
		 *  Similar, to check for a single character, we use hasNext().charAt(0).*/
		
		
	}
}