package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntersectionOfTwoArraysTest {

	private IntersectionOfTwoArrays solution;

	@Before
	public void setup() {
		solution = new IntersectionOfTwoArrays();
	}

	@Test
	public void IntersectionOfTwoArraysTestExample() {
		int[] nums1 = new int[]{1, 2, 2, 1};
		int[] nums2 = new int[]{2, 2};
		
		int[] result = solution.intersection(nums1, nums2);

		Assert.assertEquals(1, result.length);
		Assert.assertEquals(2, result[0]);
	}
}
