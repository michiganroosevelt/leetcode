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
		int[] digits = new int[32];
		boolean carry = false;

		for (int i = 0; i < 32; i++) {
			System.out.println("a: " + Integer.toBinaryString(a));
			System.out.println("b: " + Integer.toBinaryString(b));
			
			int aBit = a & 1;
			int bBit = b & 1;

			if ((aBit & bBit) == 1 && carry) {
				digits[i] = 1;
			} else if ((aBit & bBit) == 1) {
				digits[i] = 0;
				carry = true;
			} else if ((aBit | bBit) == 1 & carry) {
				digits[i] = 0;
				carry = true;
			} else if ((aBit | bBit) == 1) {
				digits[i] = 1;
				carry = false;
			} else if (carry) {
				digits[i] = 1;
				carry = false;
			} else {
				digits[i] = 0;
				carry = false;
			}
			a = a >> 1;
			b = b >> 1;
		}

		int result = 0;
		for (int i = 31; i >= 0; i--) {
			result = result << 1;
			result = result | digits[i];
		}

		return result;
	}
}
