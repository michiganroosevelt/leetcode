package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RotateArrayTest {

	private RotateArray solution;

	@Before
	public void setup() {
		solution = new RotateArray();
	}

	@Test
	public void testAddDigitsExample() {
		int[] nums = new int[]{1,2,3,4,5,6,7};
		
		solution.rotate(nums, 3);

		Assert.assertEquals(5, nums[0]);
		Assert.assertEquals(6, nums[1]);
		Assert.assertEquals(7, nums[2]);
		Assert.assertEquals(1, nums[3]);
		Assert.assertEquals(2, nums[4]);
		Assert.assertEquals(3, nums[5]);
		Assert.assertEquals(4, nums[6]);
	}

	@Test
	public void testAddDigitsExampleZeroRotation() {
		int[] nums = new int[]{1,2};
		
		solution.rotate(nums, 0);

		Assert.assertEquals(1, nums[0]);
		Assert.assertEquals(2, nums[1]);
	}

	@Test
	public void testAddDigitsExampleOneRotation() {
		int[] nums = new int[]{1,2};
		
		solution.rotate(nums, 1);

		Assert.assertEquals(2, nums[0]);
		Assert.assertEquals(1, nums[1]);
	}

	@Test
	public void testAddDigitsExampleTwoRotation() {
		int[] nums = new int[]{1};
		
		solution.rotate(nums, 2);

		Assert.assertEquals(1, nums[0]);
	}

}
