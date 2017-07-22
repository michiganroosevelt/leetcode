package roosevelt.michigan.com.easy;

/**
 * 
 * @author soup
 *
 */
public class ReverseWordsInAStringIII {

	public String reverseWords(String s) {
		char[] result = new char[s.length()];
		int start = 0;

		for (int i = 0; i < s.length(); i++) {
			result[i] = s.charAt(i);

			if (result[start] == ' ' && result[i] != ' ') {
				start = i;
			}

			if (s.charAt(i) == ' ') {
				reverseWord(start, i - 1, result);
				start = i;
			}
		}

		if (start < result.length) {
			reverseWord(start, result.length - 1, result);
		}

		return new String(result);
	}

	private void reverseWord(int startIndex, int endIndex, char[] word) {
		while (startIndex < endIndex) {
			char tmp = word[startIndex];
			word[startIndex] = word[endIndex];
			word[endIndex] = tmp;
			startIndex++;
			endIndex--;
		}
	}

}
