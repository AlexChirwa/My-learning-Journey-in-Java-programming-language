
/* AssignmentOperators: 
 * These are used to assign values to variables.
 */

public class Operators2{
	public static void main(String[] args) {
		
    	
    	// Assignment operator (=)
    	int x = 10;
    	System.out.println(x); // Output: 10
    	
    	// Assignment operator (+=)
    	int z = 10;
    	z += 2;
    	
    	System.out.println(z); // Output: 12
    	
    	// Assignment operator (-=)
    	int p = 12;
    	p -= 5;
    	
    	System.out.println(p); // Output: 7
    	
    	// Assignment operator (*=)
    	int a = 2;
    	a *= 3;
    	
    	System.out.println(a); // Output: 6 
    	
    	// Assignment operator (/=)
    	int b = 8;
    	b /= 4;
    	
    	System.out.println(b); // Output: 2
    	
    	// Assignment operator (%=)
    	int j = 5 ;
    	j = j %= 3;
    	    	
    	System.out.println(j); // Output: 2
    	
    	
    	// Revisit 
    	// Assignment operator (&=)
    	int k = 5;
    	k = k &= 3;
    	
    	System.out.println(k); // Output: 1
    	
    	// Assignment operator (|=)
    	int h = 4;
    	h = h |= 2;
    	
    	System.out.println(h); // Output: 6
    	
    	// Assignment operator (^=)
    	int t = 4;
    	t = t ^= 3;
    	
    	System.out.println(t); // Output: 7
    	
    	// Assignment operator (>>=)
    	int y = 2;
    	y = y >>= 10;
    	
    	System.out.println(y); // Output: 0
    	
    	// Assignment operator (<<=)
    	int r = 3;
    	r = r <<= 3;
    	
    	System.out.println(r); // Output: 24
    	
	}
}