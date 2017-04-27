package roosevelt.michigan.com.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author soup
 *
 */
public class ReverseVowelsOfAString {

	public String reverseVowels(String s) {
		if (s == null || s.length() == 1) {
			return s;
		}

		Map<Character, Boolean> vowelMap = new HashMap<>();
		vowelMap.put('a', true);
		vowelMap.put('e', true);
		vowelMap.put('i', true);
		vowelMap.put('o', true);
		vowelMap.put('u', true);

		vowelMap.put('A', true);
		vowelMap.put('E', true);
		vowelMap.put('I', true);
		vowelMap.put('O', true);
		vowelMap.put('U', true);

		int low = 0;
		int high = s.length() - 1;
		char[] result = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {
			result[i] = s.charAt(i);
		}

		while (low < high) {
			if (vowelMap.containsKey(s.charAt(low)) && vowelMap.containsKey(s.charAt(high))) {
				char temp = s.charAt(low);
				result[low] = s.charAt(high);
				result[high] = temp;
				low++;
				high--;
			} else if (vowelMap.containsKey(s.charAt(low))) {
				high--;
			} else if (vowelMap.containsKey(s.charAt(high))) {
				low++;
			} else {
				low++;
				high--;
			}
		}

		return new String(result);
	}

}
