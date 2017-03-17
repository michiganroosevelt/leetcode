package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxConsecutiveOnesTest {

	private MaxConsecutiveOnes solution;

	/**
	 * create ReverseString object
	 */
	@Before
	public void setup() {
		solution = new MaxConsecutiveOnes();
	}
	
	/**
	 * Unit test for ReverseString for the first example input
	 */
	@Test
	public void testFirstExampleInput() {
		int[] nums = new int[]{1,1,0,1,1,1};
		int result = solution.findMaxConsecutiveOnes(nums);

		Assert.assertEquals(3, result);
	}
	
}
