package roosevelt.michigan.com.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author soup
 *
 */
public class PlusOne {

	public int[] plusOne(int[] digits) {
		List<Integer> sum = new ArrayList<>();

		boolean carry = true;
		for (int i = digits.length - 1; i >= 0; i--) {
			int value = digits[i];
			if (carry) {
				carry = false;
				value++;
			}

			if (value >= 10) {
				carry = true;
				sum.add(0);
			} else {
				sum.add(value);
			}
		}

		if (carry) {
			sum.add(1);
		}

		int[] result = new int[sum.size()];
		for (int i = 0; i < sum.size(); i++) {
			result[sum.size() - 1 - i] = sum.get(i);
		}

		return result;
	}
}
