package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class SumOfTwoIntegersTest {

	private SumOfTwoIntegers solution;

	/**
	 * create SumOfTwoIntegers object
	 */
	@Before
	public void setup() {
		solution = new SumOfTwoIntegers();
	}
	
	/**
	 * Unit test for SumOfTwoIntegers with 2 and 3
	 */
	@Test
	public void testTwoPlusThree() {
		int result = solution.getSum(2, 3);

		Assert.assertEquals(5, result);
	}

	/**
	 * Unit test for SumOfTwoIntegers with 2 and 3
	 */
	@Test
	public void testGetSum50() {
		int result = solution.getSum(20, 30);

		Assert.assertEquals(50, result);
	}

	/**
	 * Unit test for SumOfTwoIntegers with example input
	 */
//	@Test
	public void testExampleInput() {
			
		int result = solution.getSum(1, 2);

		Assert.assertEquals(3, result);
	}

}
