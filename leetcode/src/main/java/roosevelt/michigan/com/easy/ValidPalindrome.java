package roosevelt.michigan.com.easy;

/**
 * Given a string, determine if it is a palindrome, considering only
 * alphanumeric characters and ignoring cases.
 * 
 * For example, "A man, a plan, a canal: Panama" is a palindrome. "race a car"
 * is not a palindrome.
 * 
 * Note: Have you consider that the string might be empty? This is a good
 * question to ask during an interview.
 * 
 * For the purpose of this problem, we define empty string as valid palindrome.
 * 
 * @author soup
 *
 */
public class ValidPalindrome {

	public boolean isPalindrome(String s) {
		if (s == null) {
			return false;
		}

		int front = 0;
		int back = s.length() - 1;
		s = s.toLowerCase();
		int a = (int) 'a';
		int z = (int) 'z';
		int zero = (int) '0';
		int nine = (int) '9';

		while (front < back) {
			int frontInt = (int) s.charAt(front);
			int backInt = (int) s.charAt(back);

			if ((frontInt < a || frontInt > z) && (frontInt < zero || frontInt > nine)) {
				front++;
				continue;
			}

			if ((backInt < a || backInt > z) && (backInt < zero || backInt > nine)) {
				back--;
				continue;
			}

			if (frontInt != backInt) {
				return false;
			}

			front++;
			back--;
		}

		return true;
	}
}
