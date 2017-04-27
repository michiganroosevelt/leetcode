package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseStringIITest {

	private ReverseStringII solution;

	@Before
	public void setup() {
		solution = new ReverseStringII();
	}

	@Test
	public void testReverseStringIIExample() {
		String input = "abcdefg";
		String result = solution.reverseStr(input, 2);

		Assert.assertEquals("bacdfeg", result);
	}

	@Test
	public void testReverseStringIIAllReverse() {
		String input = "abcdef";
		String result = solution.reverseStr(input, 100);

		Assert.assertEquals("fedcba", result);
	}

	@Test
	public void testReverseStringIIAllMiddle() {
		String input = "abcdef";
		String result = solution.reverseStr(input, 3);

		Assert.assertEquals("cbadef", result);
	}
}
