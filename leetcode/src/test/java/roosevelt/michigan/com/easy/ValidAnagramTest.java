package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidAnagramTest {

	private ValidAnagram solution;

	@Before
	public void setup() {
		solution = new ValidAnagram();
	}

	@Test
	public void testValidAnagram() {
		boolean result = solution.isAnagram("anagram", "nagaram");

		Assert.assertEquals(true, result);
	}

	@Test
	public void testInvalidAnagram() {
		boolean result = solution.isAnagram("rat", "car");

		Assert.assertEquals(false, result);
	}

	@Test
	public void testInvalidAnagram2() {
		boolean result = solution.isAnagram("ac", "bb");

		Assert.assertEquals(false, result);
	}

	
}
