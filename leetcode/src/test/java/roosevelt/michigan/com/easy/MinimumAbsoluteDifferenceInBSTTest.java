package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import roosevelt.michigan.com.common.TreeNode;

public class MinimumAbsoluteDifferenceInBSTTest {

	private MinimumAbsoluteDifferenceInBST solution;

	/**
	 * create ReverseString object
	 */
	@Before
	public void setup() {
		solution = new MinimumAbsoluteDifferenceInBST();
	}

	/**
	 * Unit test for MaximumDepthBinaryTree null root
	 */
	@Ignore
	@Test
	public void testNullRoot() {
		int result = solution.getMinimumDifference(null);

		Assert.assertEquals(0, result);
	}

	/**
	 * Unit test for MaximumDepthBinaryTree even
	 */
	@Ignore
	@Test
	public void testExampleInput() {
		TreeNode input = new TreeNode(1);
		TreeNode node1 = new TreeNode(3);
		TreeNode node2 = new TreeNode(2);
		input.right = node1;
		node2.left = node2;

		int result = solution.getMinimumDifference(input);

		Assert.assertEquals(1, result);
	}
}
