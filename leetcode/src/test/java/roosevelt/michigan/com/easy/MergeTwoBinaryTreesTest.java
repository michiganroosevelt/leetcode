package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import roosevelt.michigan.com.common.TreeNode;

public class MergeTwoBinaryTreesTest {

	private MergeTwoBinaryTrees solution;

	@Before
	public void setup() {
		solution = new MergeTwoBinaryTrees();
	}

	@Test
	public void testAddDigitsExample() {

		TreeNode root1 = new TreeNode(1);
		TreeNode node1 = new TreeNode(3);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(5);

		root1.left = node1;
		root1.right = node2;
		node1.left = node3;

		TreeNode root2 = new TreeNode(2);
		TreeNode node21 = new TreeNode(1);
		TreeNode node22 = new TreeNode(3);
		TreeNode node23 = new TreeNode(4);
		TreeNode node24 = new TreeNode(7);

		root2.left = node21;
		root2.right = node22;
		node21.right = node23;
		node22.right = node24;

		TreeNode result = solution.mergeTrees(root1, root2);

		Assert.assertEquals(3, result.val);
		Assert.assertEquals(4, result.left.val);
		Assert.assertEquals(5, result.right.val);
		Assert.assertEquals(5, result.left.left.val);
		Assert.assertEquals(4, result.left.right.val);
		Assert.assertEquals(7, result.right.right.val);

	}
}
