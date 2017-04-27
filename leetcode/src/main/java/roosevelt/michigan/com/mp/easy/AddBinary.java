package roosevelt.michigan.com.mp.easy;

/**
 * 
 * @author soup
 *
 */
public class AddBinary {

	public String addBinary(String a, String b) {
		int length = a.length() > b.length() ? a.length() : b.length();
		boolean carry = false;
		StringBuilder sb = new StringBuilder();
		int aIndex = a.length() - 1;
		int bIndex = b.length() - 1;

		for (int i = length - 1; i >= 0; i--) {
			char aChar, bChar;
			if (aIndex < 0) {
				aChar = '0';
			} else {
				aChar = a.charAt(aIndex);
			}

			if (bIndex < 0) {
				bChar = '0';
			} else {
				bChar = b.charAt(bIndex);
			}

			aIndex--;
			bIndex--;

			String value = null;
			if (aChar == '1' && bChar == '1') {
				if (carry) {
					value = "1";
				} else {
					value = "0";
				}
				carry = true;
			} else if ((aChar == '1' && bChar == '0') || (aChar == '0' && bChar == '1')) {
				if (carry) {
					value = "0";
					carry = true;
				} else {
					value = "1";
					carry = false;
				}
			} else {
				if (carry) {
					value = "1";
				} else {
					value = "0";
				}
				carry = false;
			}
			sb.append(value);
		}
		if (carry) {
			sb.append("1");
		}

		return sb.reverse().toString();
	}

}
