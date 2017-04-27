package roosevelt.michigan.com.mp.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RemoveDuplicatesFromSortedArrayTest {

	private RemoveDuplicatesFromSortedArray solution;

	@Before
	public void setup() {
		solution = new RemoveDuplicatesFromSortedArray();
	}

	@Test
	public void testRemoveDuplicatesFromSortedArrayFirstDuplictes() {
		int[] input = new int[] { 1, 1, 2, 3 };

		int result = solution.removeDuplicates(input);

		Assert.assertEquals(3, result);
	}

	@Test
	public void testRemoveDuplicatesFromSortedArrayMiddleDuplictes() {
		int[] input = new int[] { -3, -1, 0, 0, 0, 3, 3 };

		int result = solution.removeDuplicates(input);

		Assert.assertEquals(4, result);
	}

	@Test
	public void testRemoveDuplicatesFromSortedArrayExample() {
		int[] input = new int[] { 1, 1, 2 };

		int result = solution.removeDuplicates(input);

		Assert.assertEquals(2, result);
	}

	@Test
	public void testRemoveDuplicatesFromSortedArrayMultipleRemoves() {
		int[] input = new int[] { 1, 1, 1, 1, 2, 2, 2, 3, 3, 4 };

		int result = solution.removeDuplicates(input);

		Assert.assertEquals(4, result);
	}

	@Test
	public void testRemoveDuplicatesFromSortedArrayMultiplesRemoveAtEnd() {
		int[] input = new int[] { 1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 4, 4 };

		int result = solution.removeDuplicates(input);

		Assert.assertEquals(4, result);
	}

	@Test
	public void testRemoveDuplicatesFromSortedArrayNull() {
		int result = solution.removeDuplicates(null);

		Assert.assertEquals(0, result);
	}

	@Test
	public void testRemoveDuplicatesFromSortedArrayNoDuplicates() {
		int[] input = new int[] { 1, 2, 3 };

		int result = solution.removeDuplicates(input);

		Assert.assertEquals(3, result);
	}

	@Test
	public void testRemoveDuplicatesFromSortedArrayAllDuplicates() {
		int[] input = new int[] { 1, 1, 1 };

		int result = solution.removeDuplicates(input);

		Assert.assertEquals(1, result);
	}

}
