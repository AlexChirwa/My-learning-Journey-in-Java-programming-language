
// Here I will be refreshing my memory on what I have learned on how to accept user input from the console using
// Scanner class with the package java.util.Scanner;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		// Declare the object and initialize with the predefined object standard stream
		Scanner sc = new Scanner(System.in);
		
		// Enter user input in console  
		String greetings = sc.nextLine();
		String name = sc.nextLine();
		
		// Print the user input in console 
		System.out.println(greetings);
		System.out.println(name);
		
		
		
	}
}