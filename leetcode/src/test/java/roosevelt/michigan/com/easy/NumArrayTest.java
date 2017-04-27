package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumArrayTest {

	private NumArray solution;

	@Before
	public void setup() {
		int[] nums = new int[]{-2, 0, 3, -5, 2, -1};
		solution = new NumArray(nums);
	}

	@Test
	public void testAddDigitsExample() {
		int result = solution.sumRange(0, 2);
		Assert.assertEquals(1, result);

		result = solution.sumRange(2, 5);
		Assert.assertEquals(-1, result);

		result = solution.sumRange(0, 5);
		Assert.assertEquals(-3, result);
	}
}
