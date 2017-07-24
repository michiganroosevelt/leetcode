package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidPerfectSquareTest {

	private ValidPerfectSquare solution;

	@Before
	public void setup() {
		solution = new ValidPerfectSquare();
	}

	@Test
	public void testValidPerfectSquareTest() {
		boolean result = solution.isPerfectSquare(16);

		Assert.assertEquals(true, result);
	}

	@Test
	public void testValidPerfectSquareTest14() {
		boolean result = solution.isPerfectSquare(14);

		Assert.assertEquals(false, result);
	}

	@Test
	public void testValidPerfectSquareTest4() {
		boolean result = solution.isPerfectSquare(4);

		Assert.assertEquals(true, result);
	}

	@Test
	public void testValidPerfectSquareTest5() {
		boolean result = solution.isPerfectSquare(5);

		Assert.assertEquals(false, result);
	}

	@Test
	public void testValidPerfectSquareTest9() {
		boolean result = solution.isPerfectSquare(9);

		Assert.assertEquals(true, result);
	}

	/**
	 * should be 899s
	 */
	@Test
	public void testValidPerfectSquareTest808201() {
		boolean result = solution.isPerfectSquare(808201);

		Assert.assertEquals(true, result);
	}

		
}
