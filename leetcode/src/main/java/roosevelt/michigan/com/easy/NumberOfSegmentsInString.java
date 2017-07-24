package roosevelt.michigan.com.easy;

/**
 * 
 * @author soup
 *
 */
public class NumberOfSegmentsInString {

	public int countSegments(String s) {
		int segments = 0;
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) != ' ') {
				segments++;
				while (i < s.length() && s.charAt(i) != ' ') {
					i++;
				}
			}
		}

		return segments;
	}
}
