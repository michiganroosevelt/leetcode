package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FirstUniqueCharacterInAStringTest {

	private FirstUniqueCharacterInAString solution;

	@Before
	public void setup() {
		solution = new FirstUniqueCharacterInAString();
	}

	@Test
	public void testAddDigitsExample() {
		int result = solution.firstUniqChar("leetcode");

		Assert.assertEquals(0, result);
	}

	@Test
	public void testAddDigitsMiddle() {
		int result = solution.firstUniqChar("aabbzccdd");

		Assert.assertEquals(4, result);
	}

	@Test
	public void testAddDigitsLast() {
		int result = solution.firstUniqChar("aabbccd");

		Assert.assertEquals(6, result);
	}

	@Test
	public void testAddDigitsNone() {
		int result = solution.firstUniqChar("aabbddcc");

		Assert.assertEquals(-1, result);
	}
}
