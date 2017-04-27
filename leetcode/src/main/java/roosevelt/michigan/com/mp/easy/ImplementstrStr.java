package roosevelt.michigan.com.mp.easy;

/**
 * Implement strStr().
 * 
 * Returns the index of the first occurrence of needle in haystack, or -1 if
 * needle is not part of haystack.
 * 
 * @author soup
 *
 */
public class ImplementstrStr {

	public int strStr(String haystack, String needle) {
		if (haystack == null || needle == null) {
			return -1;
		}

		if (needle.length() <= 0) {
			return 0;
		}

		int length = needle.length();
		for (int i = 0; i < haystack.length(); i++) {
			if (i + length > haystack.length()) {
				return -1;
			}
			String found = haystack.substring(i, i + length);
			if (found.equals(needle)) {
				return i;
			}
		}

		return -1;
	}
}
