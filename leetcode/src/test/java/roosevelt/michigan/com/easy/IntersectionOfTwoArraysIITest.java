package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntersectionOfTwoArraysIITest {

	private IntersectionOfTwoArraysII solution;

	@Before
	public void setup() {
		solution = new IntersectionOfTwoArraysII();
	}

	@Test
	public void testAddDigitsExample() {
		int[] nums1 = new int[]{1,2,2,1};
		int []nums2 = new int[]{2,2};
		
		int[] result = solution.intersect(nums1, nums2);

		Assert.assertEquals(2, result[0]);
		Assert.assertEquals(2, result[1]);
	}
}
