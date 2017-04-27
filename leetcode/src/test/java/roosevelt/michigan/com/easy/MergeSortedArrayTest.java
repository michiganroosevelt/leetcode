package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MergeSortedArrayTest {

	private MergeSortedArray solution;

	@Before
	public void setup() {
		solution = new MergeSortedArray();
	}

	@Test
	public void testMergeSortedArrayExample() {

		int[] nums1 = new int[6];
		int[] nums2 = new int[] { 2, 5, 6 };
		nums1[0] = 1;
		nums1[1] = 2;
		nums1[2] = 3;
		nums1[3] = 0;
		nums1[4] = 0;
		nums1[5] = 0;

		solution.merge(nums1, 3, nums2, 3);

		Assert.assertEquals(1, nums1[0]);
		Assert.assertEquals(2, nums1[1]);
		Assert.assertEquals(2, nums1[2]);
		Assert.assertEquals(3, nums1[3]);
		Assert.assertEquals(5, nums1[4]);
		Assert.assertEquals(6, nums1[5]);
	}

	@Test
	public void testAddDigitsExample() {

		int[] nums1 = new int[10];
		int[] nums2 = new int[] { 1, 2, 3, 4, 5 };
		nums1[0] = 1;
		nums1[1] = 2;
		nums1[2] = 3;
		nums1[3] = 4;
		nums1[4] = 5;

		solution.merge(nums1, 5, nums2, 5);

		Assert.assertEquals(1, nums1[0]);
		Assert.assertEquals(1, nums1[1]);
		Assert.assertEquals(2, nums1[2]);
		Assert.assertEquals(2, nums1[3]);
		Assert.assertEquals(3, nums1[4]);
		Assert.assertEquals(3, nums1[5]);
		Assert.assertEquals(4, nums1[6]);
		Assert.assertEquals(4, nums1[7]);
		Assert.assertEquals(5, nums1[8]);
		Assert.assertEquals(5, nums1[9]);
	}
}
