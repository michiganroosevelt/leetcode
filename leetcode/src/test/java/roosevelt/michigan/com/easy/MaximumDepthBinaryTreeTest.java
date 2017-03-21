package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import roosevelt.michigan.com.easy.MaximumDepthBinaryTree.TreeNode;

public class MaximumDepthBinaryTreeTest {

	private MaximumDepthBinaryTree solution;

	/**
	 * create ReverseString object
	 */
	@Before
	public void setup() {
		solution = new MaximumDepthBinaryTree();
	}

	/**
	 * Unit test for MaximumDepthBinaryTree null root
	 */
	@Test
	public void testNullRoot() {
		int result = solution.maxDepth(null);

		Assert.assertEquals(0, result);
	}

	/**
	 * Unit test for MaximumDepthBinaryTree even
	 */
	@Test
	public void testBalancedTree() {
		TreeNode input = solution.new TreeNode(1);
		TreeNode node1 = solution.new TreeNode(1);
		TreeNode node2 = solution.new TreeNode(1);
		input.right = node1;
		input.right = node2;

		int result = solution.maxDepth(input);

		Assert.assertEquals(2, result);
	}

	/**
	 * Unit test for MaximumDepthBinaryTree right branch only
	 */
	@Test
	public void testRightTreeHeavy() {

		TreeNode input = solution.new TreeNode(1);
		TreeNode node1 = solution.new TreeNode(1);
		TreeNode node2 = solution.new TreeNode(1);
		TreeNode node3 = solution.new TreeNode(1);
		input.right = node1;
		node1.right = node2;
		node2.right = node3;

		int result = solution.maxDepth(input);

		Assert.assertEquals(4, result);
	}

	/**
	 * Unit test for MaximumDepthBinaryTree only root
	 */
	@Test
	public void testRootIsDepth() {

		TreeNode input = solution.new TreeNode(1);
		int result = solution.maxDepth(input);

		Assert.assertEquals(1, result);
	}

	/**
	 * Unit test for MaximumDepthBinaryTree for depth of 3
	 */
	@Test
	public void testThreeNodesDepth3() {

		TreeNode input = solution.new TreeNode(1);
		TreeNode node1 = solution.new TreeNode(1);
		TreeNode node2 = solution.new TreeNode(1);
		TreeNode node3 = solution.new TreeNode(1);
		input.left = node1;
		input.right = node2;
		node1.right = node3;

		int result = solution.maxDepth(input);

		Assert.assertEquals(3, result);
	}

}
