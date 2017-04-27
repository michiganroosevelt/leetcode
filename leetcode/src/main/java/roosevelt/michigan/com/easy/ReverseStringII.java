package roosevelt.michigan.com.easy;

import java.util.Arrays;

/**
 * Given a string and an integer k, you need to reverse the first k characters
 * for every 2k characters counting from the start of the string. If there are
 * less than k characters left, reverse all of them. If there are less than 2k
 * but greater than or equal to k characters, then reverse the first k
 * characters and left the other as original.
 * 
 * Example:
 * 
 * Input: s = "abcdefg", k = 2 Output: "bacdfeg"
 * 
 * Restrictions:
 * 
 * The string consists of lower English letters only. Length of the given string
 * and k will in the range [1, 10000]
 * 
 * @author soup
 *
 */
public class ReverseStringII {

	public String reverseStr(String s, int k) {
		StringBuffer sb = new StringBuffer();

		int index = 0;
		while (true) {
			if (index + k > s.length()) {
				sb.append(reverseAll(s.substring(index)));
				return sb.toString();
			} else {
				sb.append(reverseAll(s.substring(index, index + k)));
				index = index + k;
			}

			if (index + k > s.length()) {
				sb.append(s.substring(index));
				return sb.toString();
			} else {
				sb.append(s.substring(index, index + k));
				index = index + k;
			}

		}

	}

	public String reverseAll(String input) {
		char[] reversed = new char[input.length()];
		int low = 0;
		int high = input.length() - 1;
		while (low <= high) {
			reversed[low] = input.charAt(high);
			reversed[high] = input.charAt(low);
			low++;
			high--;
		}

		return String.valueOf(reversed);
	}

}
