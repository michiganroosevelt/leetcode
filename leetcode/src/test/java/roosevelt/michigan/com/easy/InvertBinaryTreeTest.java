package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import roosevelt.michigan.com.common.TreeNode;



public class InvertBinaryTreeTest {

	
	private InvertBinaryTree solution;

	/**
	 * create InvertBinaryTree object
	 */
	@Before
	public void setup() {
		solution = new InvertBinaryTree();
	}


	/**
	 * Unit test for InvertBinaryTree for a balanced tree
	 */
	@Test
	public void testBalancedTree() {
		TreeNode input = new TreeNode(1);
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(3);
		input.right = node1;
		input.left = node2;

		TreeNode result = solution.invertTree(input);

		Assert.assertEquals(1, result.val);
		Assert.assertEquals(2, result.left.val);
		Assert.assertEquals(3, result.right.val);
	}

}
