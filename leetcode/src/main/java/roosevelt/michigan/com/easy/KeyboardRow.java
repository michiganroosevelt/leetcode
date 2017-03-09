package roosevelt.michigan.com.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a List of words, return the words that can be typed using letters of
 * alphabet on only one row's of American keyboard like the image below.
 * 
 * Example 1:
 * 
 * Input: ["Hello", "Alaska", "Dad", "Peace"] Output: ["Alaska", "Dad"]
 * 
 * Note:
 * 
 * You may use one character in the keyboard more than once. You may assume the
 * input string will only contain letters of alphabet.
 * 
 * @author soup
 *
 */
public class KeyboardRow {

	public String[] findWords(String[] words) {
		if (words == null) {
			return new String[0];
		}

		Map<Character, Boolean> upperRowCharacters = new HashMap<>();
		Map<Character, Boolean> middleRowCharacters = new HashMap<>();
		Map<Character, Boolean> lowerRowCharacters = new HashMap<>();

		String upper = "qwertyuiop";
		String middle = "asdfghjkl";
		String lower = "zxcvbnm";

		for (int i = 0; i < upper.length(); i++) {
			upperRowCharacters.put(upper.charAt(i), true);
		}

		for (int i = 0; i < middle.length(); i++) {
			middleRowCharacters.put(middle.charAt(i), true);
		}

		for (int i = 0; i < lower.length(); i++) {
			lowerRowCharacters.put(lower.charAt(i), true);
		}

		List<String> result = new ArrayList<>();

		for (String word : words) {
			if (word == null) {
				continue;
			}

			boolean hasUpper = false;
			boolean hasMiddle = false;
			boolean hasLower = false;

			for (int i = 0; i < word.length(); i++) {
				char letter = word.charAt(i);
				if (upperRowCharacters.containsKey(letter)) {
					hasUpper = true;
				} else if (middleRowCharacters.containsKey(letter)) {
					hasMiddle = true;
				} else if (lowerRowCharacters.containsKey(letter)) {
					hasLower = true;
				}
			}

			int count = 0;
			if (hasUpper) {
				count++;
			}

			if (hasMiddle) {
				count++;
			}

			if (hasLower) {
				count++;
			}

			if (count == 1) {
				result.add(word);
			}

		}

		String[] resultArray = new String[result.size()];
		for (int i = 0; i < result.size(); i++) {
			resultArray[i] = result.get(i);
		}

		return resultArray;
	}

}
