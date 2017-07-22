package roosevelt.michigan.com.easy;

/**
 * Given a non-negative integer num, repeatedly add all its digits until the
 * result has only one digit.
 * 
 * For example:
 * 
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only
 * one digit, return it.
 * 
 * @author soup
 *
 */
public class AddDigits {

	public int addDigits(int num) {
		if (num < 10) {
			return num;
		}

		int sum = 0;
		do {
			while (num > 0) {
				sum += num % 10;
				num = num / 10;
			}
			num = sum;
			sum = 0;
		} while (num >= 10);

		return num;
	}

	/**
	 * recursive solution
	 * 
	 * @param num
	 * @return
	 */
	public int addDigitsRecursive(int num) {
		if (num < 10) {
			return num;
		}

		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num = num / 10;
		}

		return addDigits(sum);
	}

	/**
	 * String manipulation with a poor runtime
	 * 
	 * @param num
	 * @return
	 */
	public int addDigitsStringManipulation(int num) {
		String input = Integer.toString(num);
		if (input.length() == 1) {
			return Integer.parseInt(input);
		}

		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			String current = Character.toString(input.charAt(i));
			sum += new Integer(current);
		}

		return addDigits(sum);
	}
}
