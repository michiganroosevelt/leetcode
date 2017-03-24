package roosevelt.michigan.com.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t, determine if they are isomorphic.
 * 
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * 
 * All occurrences of a character must be replaced with another character while
 * preserving the order of characters. No two characters may map to the same
 * character but a character may map to itself.
 * 
 * For example, Given "egg", "add", return true.
 * 
 * Given "foo", "bar", return false.
 * 
 * Given "paper", "title", return true.
 * 
 * Note: You may assume both s and t have the same length.
 * 
 * @author soup
 *
 */
public class IsomorphicStrings {

	public boolean isIsomorphic(String s, String t) {
		Map<Character, Character> forwardMap = new HashMap<>();
		Map<Character, Character> reverseMap = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char forwardChar = s.charAt(i);
			char reverseChar = t.charAt(i);

			if (forwardMap.containsKey(forwardChar) && forwardMap.get(forwardChar) != reverseChar) {
				return false;
			} else if (reverseMap.containsKey(reverseChar) && reverseMap.get(reverseChar) != forwardChar) {
				return false;
			}

			forwardMap.put(forwardChar, reverseChar);
			reverseMap.put(reverseChar, forwardChar);
		}

		return true;
	}

}
