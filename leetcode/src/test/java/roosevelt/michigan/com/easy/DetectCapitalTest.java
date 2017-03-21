package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DetectCapitalTest {

	private DetectCapital solution;

	/**
	 * create ReverseString object
	 */
	@Before
	public void setup() {
		solution = new DetectCapital();
	}

	/**
	 * Unit test for NimGame for the first example input
	 */
	@Test
	public void testFirstExampleInput() {
		Assert.assertEquals(true, solution.detectCapitalUse("USA"));
		Assert.assertEquals(true, solution.detectCapitalUse("U"));
		Assert.assertEquals(true, solution.detectCapitalUse("u"));
		Assert.assertEquals(true, solution.detectCapitalUse("leetcode"));
		Assert.assertEquals(true, solution.detectCapitalUse("Google"));
		Assert.assertEquals(false, solution.detectCapitalUse("faIl"));
		Assert.assertEquals(false, solution.detectCapitalUse("faIls"));
	}
	
}
