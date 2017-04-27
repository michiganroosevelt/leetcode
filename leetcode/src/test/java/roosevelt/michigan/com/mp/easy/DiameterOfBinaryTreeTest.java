package roosevelt.michigan.com.mp.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import roosevelt.michigan.com.common.TreeNode;

public class DiameterOfBinaryTreeTest {

	private DiameterOfBinaryTree solution;

	@Before
	public void setup() {
		solution = new DiameterOfBinaryTree();
	}

	@Test
	public void testDiameterOfBinaryTreeExample() {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node3 = new TreeNode(3);
		
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		
		
		int result = solution.diameterOfBinaryTree(node1);

		Assert.assertEquals(3, result);
	}
}
