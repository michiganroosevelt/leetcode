package roosevelt.michigan.com.mp.easy;

/**
 * The count-and-say sequence is the sequence of integers beginning as follows:
 * 1, 11, 21, 1211, 111221, ...
 * 
 * 1 is read off as "one 1" or 11. 11 is read off as "two 1s" or 21. 21 is read
 * off as "one 2, then one 1" or 1211.
 * 
 * Given an integer n, generate the nth sequence.
 * 
 * Note: The sequence of integers will be represented as a string.
 * 
 * @author soup
 *
 */
public class CountAndSay {

	public String countAndSay(int n) {
		String last = "1";

		for (int i = 1; i < n; i++) {
			last = generateNextSequence(last);
		}

		return last;
	}

	public String generateNextSequence(String input) {
		StringBuilder sb = new StringBuilder();

		if (input.length() == 1) {
			return "1" + input.charAt(0);
		}

		int counter = 1;
		char last = input.charAt(0);
		for (int i = 1; i < input.length(); i++) {
			if (last == input.charAt(i)) {
				counter++;
			} else {
				sb.append(counter);
				sb.append(last);
				counter = 1;
				last = input.charAt(i);
			}

		}
		sb.append(counter);
		sb.append(last);

		return sb.toString();
	}

}
