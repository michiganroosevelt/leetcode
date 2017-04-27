package roosevelt.michigan.com.mp.easy;

import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid
 * but "(]" and "([)]" are not.
 * 
 * @author soup
 *
 */
public class ValidParentheses {

	public boolean isValid(String s) {
		Stack<Character> expect = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				expect.push(')');
			} else if (s.charAt(i) == '{') {
				expect.push('}');
			} else if (s.charAt(i) == '[') {
				expect.push(']');
			} else {
				if (expect.size() <= 0 || expect.pop() != s.charAt(i)) {
					return false;
				}
			}
		}

		return expect.size() == 0;
	}

}
