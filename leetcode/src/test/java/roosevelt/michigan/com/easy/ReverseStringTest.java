package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for ReverseString
 * 
 * @author soup
 *
 */
public class ReverseStringTest {

	private ReverseString solution;

	/**
	 * create ReverseString object
	 */
	@Before
	public void setup() {
		solution = new ReverseString();
	}
	
	/**
	 * Unit test for ReverseString when input null
	 */
	@Test
	public void testNullInput() {
		String input = null;
		String result = solution.reverseString(input);

		Assert.assertEquals(null, result);
	}


	/**
	 * Unit test for ReverseString with example input
	 */
	@Test
	public void testExampleInput() {
		String input = "hello";
		String result = solution.reverseString(input);

		Assert.assertEquals("olleh", result);
	}

	/**
	 * Unit test for ReverseString when input is of length 1
	 */
	@Test
	public void testSingleLetter() {
		String input = "e";
		String result = solution.reverseString(input);

		Assert.assertEquals("e", result);
	}

}
