package roosevelt.michigan.com.medium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CountingBitsTest {

	private CountingBits solution;

	@Before
	public void setup() {
		solution = new CountingBits();
	}

	@Test
	public void testAddDigitsExample() {
		int[] result = solution.countBits(5);

		Assert.assertEquals(6, result.length);

		Assert.assertEquals(0, result[0]);
		Assert.assertEquals(1, result[1]);
		Assert.assertEquals(1, result[2]);
		Assert.assertEquals(2, result[3]);
		Assert.assertEquals(1, result[4]);
		Assert.assertEquals(2, result[5]);

	}
}
