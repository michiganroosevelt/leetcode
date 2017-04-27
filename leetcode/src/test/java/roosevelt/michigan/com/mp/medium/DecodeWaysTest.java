package roosevelt.michigan.com.mp.medium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DecodeWaysTest {

	private DecodeWays solution;

	@Before
	public void setup() {
		solution = new DecodeWays();
	}

	@Test
	public void testAddDigitsExample() {
		String input = "12";
		int result = solution.numDecodings("input");

		Assert.assertEquals(2, result);
	}
}
