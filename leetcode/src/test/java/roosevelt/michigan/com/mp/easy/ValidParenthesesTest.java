package roosevelt.michigan.com.mp.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidParenthesesTest {

	private ValidParentheses solution;

	@Before
	public void setup() {
		solution = new ValidParentheses();
	}

	@Test
	public void testValidNestedString() {
		boolean result = solution.isValid("(([{}]))");

		Assert.assertEquals(true, result);
	}

	@Test
	public void testValidParenthesesString() {
		boolean result = solution.isValid("()");

		Assert.assertEquals(true, result);
	}

	@Test
	public void testValidParenthesesStringAllTypes() {
		boolean result = solution.isValid("()[]{}");

		Assert.assertEquals(true, result);
	}

	@Test
	public void testInvalidParenthesesStringTwoTypes() {
		boolean result = solution.isValid("(]");

		Assert.assertEquals(false, result);
	}

	@Test
	public void testInvalidParenthesesStringAllTypes() {
		boolean result = solution.isValid("([)]");

		Assert.assertEquals(false, result);
	}

	@Test
	public void testInvalidParenthesesFalseTooShort() {
		boolean result = solution.isValid("(");

		Assert.assertEquals(false, result);
	}

}
