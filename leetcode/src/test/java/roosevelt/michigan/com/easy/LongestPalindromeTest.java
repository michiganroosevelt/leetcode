package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestPalindromeTest {

	private LongestPalindrome solution;

	@Before
	public void setup() {
		solution = new LongestPalindrome();
	}

	@Test
	public void testLongestPalindromeExample() {
		int result = solution.longestPalindrome("abccccdd");

		Assert.assertEquals(7, result);
	}

	@Test
	public void testLongestPalindromeOne() {
		int result = solution.longestPalindrome("a");

		Assert.assertEquals(1, result);
	}

	@Test
	public void testLongestPalindromeFive() {
		int result = solution.longestPalindrome("aaabb");

		Assert.assertEquals(5, result);
	}
}
