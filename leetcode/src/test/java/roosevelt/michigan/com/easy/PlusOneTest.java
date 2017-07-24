package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PlusOneTest {

	private PlusOne solution;

	@Before
	public void setup() {
		solution = new PlusOne();
	}

	@Test
	public void testPlusOneNineityNine() {
		int[] input = new int[]{9,9};
		
		int[] result = solution.plusOne(input);

		Assert.assertEquals(1, result[0]);
		Assert.assertEquals(0, result[1]);
		Assert.assertEquals(0, result[2]);
	}

	@Test
	public void testPlusOneTen() {
		int[] input = new int[]{1,0};
		
		int[] result = solution.plusOne(input);

		Assert.assertEquals(1, result[0]);
		Assert.assertEquals(1, result[1]);
	}
}
