package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PowerOfTwoTest {

	private PowerOfTwo solution;

	@Before
	public void setup() {
		solution = new PowerOfTwo();
	}

	@Test
	public void testPowerOfTwoNegative2147483648() {
		boolean result = solution.isPowerOfTwo(-2147483648);

		Assert.assertEquals(false, result);
	}

	@Test
	public void testPowerOfTwo5() {
		boolean result = solution.isPowerOfTwo(5);

		Assert.assertEquals(false, result);
	}

	@Test
	public void testPowerOfTwo4() {
		boolean result = solution.isPowerOfTwo(4);

		Assert.assertEquals(true, result);
	}

	@Test
	public void testPowerOfTwo8() {
		boolean result = solution.isPowerOfTwo(8);

		Assert.assertEquals(true, result);
	}
}
