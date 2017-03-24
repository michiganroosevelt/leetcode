package roosevelt.michigan.com.easy;

/**
 * 
 * Calculate the sum of two integers a and b, but you are not allowed to use the
 * operator + and -.
 * 
 * Example: Given a = 1 and b = 2, return 3.
 * 
 * @author soup
 *
 */
public class SumOfTwoIntegers {
    public int getSum(int a, int b) {
    	
    	
    	System.out.println("a is: " + Integer.toBinaryString(a));
    	System.out.println("b is: " + Integer.toBinaryString(b));
    	
    	int or = a | b;
    	System.out.println("or is: " + Integer.toBinaryString(or));
    	int xor = a ^ b;
    	System.out.println("xor is: " + Integer.toBinaryString(xor));
    	int and = a & b;
    	System.out.println("and is: " + Integer.toBinaryString(and));
    	
    	int a1 = or >> xor;
    	System.out.println("a1 is: " + Integer.toBinaryString(a1));
    	int a2 = and >> xor;
    	System.out.println("a2 is: " + Integer.toBinaryString(a2));
    	
    	
    	
    	
    	
        
    	return 1;
    }
}
