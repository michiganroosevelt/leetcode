package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TwoSumTest {

	private TwoSum solution;

	@Before
	public void setup() {
		solution = new TwoSum();
	}

	@Test
	public void testTwoSumSimpleCase() {
		int[] nums = new int[] { 2, 7, 11, 15 };
		int[] result = solution.twoSum(nums, 9);

		Assert.assertEquals(2, result.length);
		Assert.assertEquals(0, result[0]);
		Assert.assertEquals(1, result[1]);
	}

	@Test
	public void testTwoSumAnotherSimpleCase() {
		int[] nums = new int[] { 2, 7, 11, 15 };
		int[] result = solution.twoSum(nums, 22);

		Assert.assertEquals(2, result.length);
		Assert.assertEquals(1, result[0]);
		Assert.assertEquals(3, result[1]);
	}

}
