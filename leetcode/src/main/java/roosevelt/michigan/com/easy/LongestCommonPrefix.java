package roosevelt.michigan.com.easy;

/**
 * 
 * @author soup
 *
 */
public class LongestCommonPrefix {

	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}

		StringBuilder sb = new StringBuilder();
		int index = 0;

		while (true) {
			String current = strs[0];
			if (current == null || index >= current.length()) {
				return sb.toString();
			}

			char letter = current.charAt(index);
			for (int i = 0; i < strs.length; i++) {
				current = strs[i];
				if (index >= current.length()) {
					return sb.toString();
				}
				if (current.charAt(index) != letter) {
					return sb.toString();
				}
			}
			sb.append(letter);
			index++;
		}
	}

}
