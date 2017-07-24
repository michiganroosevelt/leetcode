package roosevelt.michigan.com.easy;

/**
 * 
 * @author soup
 *
 */
public class AddStrings {

	public String addStrings(String num1, String num2) {
		StringBuilder sb = new StringBuilder();
		if (num1 == null || num1.length() < 0) {
			return num2;
		}

		if (num2 == null || num2.length() < 0) {
			return num1;
		}

		int num1Length = num1.length();
		int num2Length = num2.length();

		int index = Math.min(num1Length, num2Length);
		boolean carry = false;

		for (int i = 0; i < index; i++) {
			short value1 = Short.parseShort(Character.toString((num1.charAt(num1Length - i - 1))));
			short value2 = Short.parseShort(Character.toString((num2.charAt(num2Length - i - 1))));

			int carryVal = carry ? 1 : 0;
			int sum = value1 + value2 + carryVal;

			if (sum >= 10) {
				carry = true;
				sb.append(sum % 10);
			} else {
				carry = false;
				sb.append(sum);
			}
		}

		String longest = num1Length >= num2Length ? num1 : num2;
		for (int i = 0; i < longest.length() - index; i++) {
			short value1 = Short.parseShort(Character.toString((longest.charAt(longest.length() - i - index - 1))));

			int carryVal = carry ? 1 : 0;
			int sum = value1 + carryVal;

			if (sum >= 10) {
				carry = true;
				sb.append(sum % 10);
			} else {
				carry = false;
				sb.append(sum);
			}
		}
		if (carry) {
			sb.append("1");
		}

		return sb.reverse().toString();
	}

}
