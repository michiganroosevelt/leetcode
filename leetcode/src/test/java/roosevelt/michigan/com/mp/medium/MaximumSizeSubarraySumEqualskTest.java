package roosevelt.michigan.com.mp.medium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumSizeSubarraySumEqualskTest {

	private MaximumSizeSubarraySumEqualsk solution;

	@Before
	public void setup() {
		solution = new MaximumSizeSubarraySumEqualsk();
	}

	@Test
	public void testAddDigitsExample() {
		int[] input = new int[]{1, -1, 5, -2, 3};
		int result = solution.maxSubArrayLen(input,3);

		Assert.assertEquals(4, result);
	}

	@Test
	public void testAddDigitsExample2() {
		int[] input = new int[]{-2, -1, 2, 1};
		int result = solution.maxSubArrayLen(input,1);

		Assert.assertEquals(2, result);
	}
}
