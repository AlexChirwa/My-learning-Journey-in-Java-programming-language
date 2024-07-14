/* Date: 7.14.2024
 * Author: Chirwa Alex Joshua
 * Topic: Java Methods
 */

// looping through a method
// declare 
public class methods4{
	static void ageLimit(int age) {
		if (age < 11) {
			System.out.println(age + " you are not qualified to be a teenager");
		}else {
			System.out.println(age + " you are a teenager");
		}
	}
	public static void main(String[] args) {
		ageLimit(8);
		ageLimit(13);
	}
}