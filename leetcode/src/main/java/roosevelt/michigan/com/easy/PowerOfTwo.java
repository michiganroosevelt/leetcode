package roosevelt.michigan.com.easy;

/**
 * 
 * @author soup
 *
 */
public class PowerOfTwo {

	public boolean isPowerOfTwo(int n) {
		if (n <= 0) {
			return false;
		}

		boolean foundOne = false;
		while (n != 0) {
			if ((n & 1) == 1) {
				if (foundOne) {
					return false;
				} else {
					foundOne = true;
				}
			}
			n = n >>> 1;
		}

		return true;
	}
}
