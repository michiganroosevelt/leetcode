package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindTheDifferenceTest {

	private FindTheDifference solution;

	/**
	 * create FindTheDifference object
	 */
	@Before
	public void setup() {
		solution = new FindTheDifference();
	}
	
	/**
	 * Unit test for FindTheDifference for example input
	 */
	@Test
	public void testExampleInput() {
		String s = "abcd";
		String t = "abcde";
			
		char result = solution.findTheDifference(s, t);

		Assert.assertEquals('e', result);
	}

}
