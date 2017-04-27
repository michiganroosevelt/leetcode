package roosevelt.michigan.com.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Given a string which consists of lowercase or uppercase letters, find the
 * length of the longest palindromes that can be built with those letters.
 * 
 * This is case sensitive, for example "Aa" is not considered a palindrome here.
 * 
 * Note: Assume the length of given string will not exceed 1,010.
 * 
 * Example:
 * 
 * Input: "abccccdd"
 * 
 * Output: 7
 * 
 * Explanation: One longest palindrome that can be built is "dccaccd", whose
 * length is 7.
 * 
 * 
 * @author soup
 *
 */
public class LongestPalindrome {

	public int longestPalindrome(String s) {
		Map<Character, Integer> characterCount = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char current = s.charAt(i);
			if (characterCount.containsKey(current)) {
				characterCount.put(current, characterCount.get(current).intValue() + 1);
			} else {
				characterCount.put(current, 1);
			}
		}

		int total = 0;
		boolean foundOdd = false;
		for (Integer value : characterCount.values()) {
			if (value % 2 == 0) {
				total += value;
			} else {
				foundOdd = true;
				total += value - 1;
			}
		}

		if (foundOdd) {
			total++;
		}

		return total;
	}

}
