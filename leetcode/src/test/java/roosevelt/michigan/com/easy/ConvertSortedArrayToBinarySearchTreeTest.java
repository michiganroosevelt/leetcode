package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import roosevelt.michigan.com.common.TreeNode;

public class ConvertSortedArrayToBinarySearchTreeTest {

	private ConvertSortedArrayToBinarySearchTree solution;

	@Before
	public void setup() {
		solution = new ConvertSortedArrayToBinarySearchTree();
	}

	@Test
	public void testAddDigitsExample() {
		int[] input = new int[] { 1, 2, 3, 4, 5, 6 };
		TreeNode result = solution.sortedArrayToBST(input);

		Assert.assertEquals(null, result);
	}
}
