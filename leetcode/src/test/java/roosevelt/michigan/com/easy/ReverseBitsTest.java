package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseBitsTest {

	private ReverseBits solution;

	@Before
	public void setup() {
		solution = new ReverseBits();
	}

	@Test
	public void testAddDigitsExample() {
		int result = solution.reverseBits(43261596);

		Assert.assertEquals(964176192, result);
	}

	public void testAddDigitsFive() {
		int result = solution.reverseBits(5);

		Assert.assertEquals(964176192, result);
	}
}
