package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import roosevelt.michigan.com.easy.ValidPalindrome;

public class ValidPalindromeTest {

	private ValidPalindrome solution;

	@Before
	public void setup() {
		solution = new ValidPalindrome();
	}

	@Test
	public void testValidPalindromeWithNumber() {
		String input = "0P";

		boolean result = solution.isPalindrome(input);

		Assert.assertEquals(false, result);
	}

	@Test
	public void testValidPalindrome() {
		String input = "A man, a plan, a canal: Panama";

		boolean result = solution.isPalindrome(input);

		Assert.assertEquals(true, result);
	}

	@Test
	public void testValidPalindromeNoSpacesEven() {
		String input = "abccba";

		boolean result = solution.isPalindrome(input);

		Assert.assertEquals(true, result);
	}

	@Test
	public void testValidPalindromeNoSpacesOdd() {
		String input = "abcba";

		boolean result = solution.isPalindrome(input);

		Assert.assertEquals(true, result);
	}

	@Test
	public void testValidPalindromeSpacesOdd() {
		String input = "   (()** abcb *())(*   a";

		boolean result = solution.isPalindrome(input);

		Assert.assertEquals(true, result);
	}

	@Test
	public void testInvalidPalindrome() {
		String input = "race a car";

		boolean result = solution.isPalindrome(input);

		Assert.assertEquals(false, result);
	}

}
