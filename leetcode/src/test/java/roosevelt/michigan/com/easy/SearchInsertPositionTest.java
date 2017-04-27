package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SearchInsertPositionTest {

	
	private SearchInsertPosition solution;

	@Before
	public void setup() {
		solution = new SearchInsertPosition();
	}

	@Test
	public void testSearchInsertPositionInList() {
		int[] nums = new int[] { 1,3,5,6 };
		int result = solution.searchInsert(nums, 5);

		Assert.assertEquals(2, result);
	}

	@Test
	public void testSearchInsertPositionNotInList() {
		int[] nums = new int[] { 1,3,5,6 };
		int result = solution.searchInsert(nums, 2);

		Assert.assertEquals(1, result);
	}

	@Test
	public void testSearchInsertPositionEndOfList() {
		int[] nums = new int[] { 1,3,5,6 };
		int result = solution.searchInsert(nums, 7);

		Assert.assertEquals(4, result);
	}

	@Test
	public void testSearchInsertPositionBeginningInList() {
		int[] nums = new int[] { 1,3,5,6 };
		int result = solution.searchInsert(nums, 0);

		Assert.assertEquals(0, result);
	}

	@Test
	public void testSearchInsertPositionLengthOne() {
		int[] nums = new int[] { 1 };
		int result = solution.searchInsert(nums, 2);

		Assert.assertEquals(1, result);
	}

	@Test
	public void testSearchInsertPositionLengthOneInsertBeginning() {
		int[] nums = new int[] { 1 };
		int result = solution.searchInsert(nums, 0);

		Assert.assertEquals(0, result);
	}

}
