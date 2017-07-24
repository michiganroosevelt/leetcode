package roosevelt.michigan.com.easy;

/**
 * 
 * @author soup
 *
 */
public class ValidPerfectSquare {

	public boolean isPerfectSquare(int num) {
		if (num == 0) {
			return false;
		}

		if (num == 1) {
			return true;
		}

		int low = 1;
		int high = num / 2;
		while (low < high) {
			int mid = (low + high) / 2;

			double sqrt = mid * mid;
			double sqrtHigh = high * high;
			if (sqrt == num || sqrtHigh == num) {
				return true;
			}

			if (sqrt > num) {
				high = mid;
			} else {
				if (low == mid) {
					low++;
				} else {
					low = mid;
				}
			}
		}

		return false;
	}

}
