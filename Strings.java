
/* A string is used to store texts, string variables contain a collection of characters 
 * surrounded by double quotes. 
 * 
 * below I will write several programs related to Strings in Java. 
 */

public class Strings{
	public static void main(String[] args) {
		
		/* A program to demonstrate a String Length.
		 * the length() method is used to find the length of a string.
		 */
		
		String txt = "ABCDEFG";
		System.out.println(txt.length()); // Output: 7
		
		////////////////////////////////////////////////////////////////
		
		/* The lower case and upper case methods.
		 * If we want to change the string from lower case to upper case or 
		 * vice versa we use these methods: toLowerCase() and toUpperCase()
		 */
		
		String name = "ALEX", name2 = "joshua";
		System.out.println("lower case: " + name.toLowerCase()); // Output: alex
		System.out.println("Upper case: " + name2.toUpperCase()); // Output: JOSHUA
		
		//////////////////////////////////////////////////////////////////
		
		/* Finding a Character in a string :
		 * to find a character in a string we use the indeOf()method.
		 * indexOf() method returns the index position of the first occurrence of a specified text
		 */

		String txt2 = "can you locate the word 'locate'";
		System.out.println("index of 'locate' " + txt2.indexOf("locate")); // Output: 8
		
		// if we want to specify the starting point we use this form.
		System.out.println(txt2.indexOf("locate", 23)); // Output: 25
		
		///////////////////////////////////////////////////////////////////
		
		/* String Concatenation:
		 * It is the combination of two separate strings,
		 * we use the + operator to combine.
		 */
		
		String text1 = "I like ";
		String text2 = "ice cream.";
		
		System.out.println(text1 + text2); // Output: I like ice cream.
		
		// we can also use the Concatenation method: concat()
		System.out.println(text1.concat(text2)); // Output: I like ice cream.
		
	}
}