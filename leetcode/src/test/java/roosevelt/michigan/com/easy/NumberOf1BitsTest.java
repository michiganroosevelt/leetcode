package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumberOf1BitsTest {

	private NumberOf1Bits solution;

	@Before
	public void setup() {
		solution = new NumberOf1Bits();
	}

//	@Test
	public void testNumberOf1Bits() {
		int result = solution.hammingWeight(11);

		Assert.assertEquals(3, result);
	}

	@Test
	public void testNumberOf1BitsMax() {
		int result = solution.hammingWeight(0x80000000);

		Assert.assertEquals(1, result);
	}
}
