package roosevelt.michigan.com.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, find the first non-repeating character in it and return it's
 * index. If it doesn't exist, return -1.
 * 
 * Examples:
 * 
 * s = "leetcode" return 0.
 * 
 * s = "loveleetcode", return 2.
 * 
 * Note: You may assume the string contain only lowercase letters.
 * 
 * @author soup
 *
 */
public class FirstUniqueCharacterInAString {

	public int firstUniqChar(String s) {
		Map<Character, Integer> count = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (!count.containsKey(s.charAt(i))) {
				count.put(s.charAt(i), 1);
			} else {
				count.put(s.charAt(i), count.get(s.charAt(i)).intValue() + 1);
			}
		}

		for (int i = 0; i < s.length(); i++) {
			if (count.get(s.charAt(i)).intValue() == 1) {
				return i;
			}
		}

		return -1;
	}

}
