package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class NextGreaterElementOneTest {

	private NextGreaterElementOne solution;

	/**
	 * create ReverseString object
	 */
	@Before
	public void setup() {
		solution = new NextGreaterElementOne();
	}
	
	/**
	 * Unit test for ReverseString for the first example input
	 */
	@Test
	public void testFirstExampleInput() {
		int[] findNums = new int[]{4,1,2};
		int[] nums = new int[]{1,3,4,2};
		
		
		int[] result = solution.nextGreaterElement(findNums, nums);

		Assert.assertEquals(-1, result[0]);
		Assert.assertEquals(3, result[1]);
		Assert.assertEquals(-1, result[2]);
	}

	/**
	 * Unit test for ReverseString for the second example input
	 */
	@Test
	public void testSecondExampleInput() {
		int[] findNums = new int[]{2,4};
		int[] nums = new int[]{1,2,3,4};
		
		
		int[] result = solution.nextGreaterElement(findNums, nums);

		Assert.assertEquals(3, result[0]);
		Assert.assertEquals(-1, result[1]);
	}

	/**
	 * Unit test for ReverseString 
	 */
	@Ignore
	@Test
	public void testAnotherExampleInput() {
		int[] findNums = new int[]{4,1,2};
		int[] nums = new int[]{1,2,3,4};
		
		
		int[] result = solution.nextGreaterElement(findNums, nums);

		Assert.assertEquals(-1, result[0]);
		Assert.assertEquals(2, result[1]);
		Assert.assertEquals(3, result[2]);
	}

}
