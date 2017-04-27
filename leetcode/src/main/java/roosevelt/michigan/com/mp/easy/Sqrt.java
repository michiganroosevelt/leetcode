package roosevelt.michigan.com.mp.easy;

/**
 * 
 * Implement int sqrt(int x).
 * 
 * Compute and return the square root of x.
 * 
 * @author soup
 *
 */
public class Sqrt {

	public int mySqrt(int x) {
		if (x == 0) {
			return x;
		}

		if (x == 1) {
			return x;
		}

		int lower = 1;
		int upper = 46341;
		int mid = (upper - lower) / 2;
		while ((lower + 1) < upper) {
			int sqrt = mid * mid;

			if (sqrt <= 0) {
				upper = mid;
				mid = mid - ((upper - lower) / 2);
			} else if (sqrt == x) {
				return mid;
			} else if (sqrt > x) {
				upper = mid;
				mid = mid - ((upper - lower) / 2);
			} else {
				lower = mid;
				mid = mid + ((upper - lower) / 2);
			}
		}

		return lower;
	}

}
