package roosevelt.michigan.com.easy;

/**
 * Write a function that takes a string as input and returns the string
 * reversed.
 * 
 * Example: Given s = "hello", return "olleh".
 * 
 * @author soup
 *
 */
public class ReverseString {

	/**
	 * Reverses a String
	 * 
	 * @param s
	 *            the input String
	 * @return the input String in reverse order
	 */
	public String reverseString(String s) {
		if (s == null) {
			return null;
		}

		char[] reverse = new char[s.length()];
		int reverseIndex = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse[reverseIndex] = s.charAt(i);
			reverseIndex++;
		}

		return String.valueOf(reverse);
	}

}
