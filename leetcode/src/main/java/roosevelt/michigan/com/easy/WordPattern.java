package roosevelt.michigan.com.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author soup
 *
 */
public class WordPattern {

	public boolean wordPattern(String pattern, String str) {
		String[] words = str.split(" ");
		Map<Character, String> patternLookUp = new HashMap<>();
		Map<String, Character> wordLookUp = new HashMap<>();

		if (pattern.length() != words.length) {
			return false;
		}

		for (int i = 0; i < pattern.length(); i++) {
			char patternChar = pattern.charAt(i);
			String word = words[i];

			if (patternLookUp.containsKey(patternChar)) {
				String foundWord = patternLookUp.get(patternChar);
				if (!foundWord.equals(word)) {
					return false;
				}
			} else {
				patternLookUp.put(patternChar, word);
			}

			if (wordLookUp.containsKey(word)) {
				Character foundCharacter = wordLookUp.get(word);
				if (foundCharacter.charValue() != patternChar) {
					return false;
				}
			} else {
				wordLookUp.put(word, patternChar);
			}

		}

		return true;
	}
}
