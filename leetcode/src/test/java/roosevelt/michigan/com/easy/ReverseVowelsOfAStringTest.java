package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseVowelsOfAStringTest {

	private ReverseVowelsOfAString solution;

	@Before
	public void setup() {
		solution = new ReverseVowelsOfAString();
	}

	@Test
	public void testAddDigitsExample() {
		String result = solution.reverseVowels("hello");

		Assert.assertEquals("holle", result);
	}

	@Test
	public void testAddDigitsExample2() {
		String result = solution.reverseVowels("leetcode");

		Assert.assertEquals("leotcede", result);
	}

	@Test
	public void testAddDigitsEmptyString() {
		String result = solution.reverseVowels(" ");

		Assert.assertEquals(" ", result);
	}

	@Test
	public void testAddDigitsOneVowel() {
		String result = solution.reverseVowels("a.");

		Assert.assertEquals("a.", result);
	}
}
