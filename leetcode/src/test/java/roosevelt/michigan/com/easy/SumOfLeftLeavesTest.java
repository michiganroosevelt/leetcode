package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import roosevelt.michigan.com.common.TreeNode;

public class SumOfLeftLeavesTest {

	private SumOfLeftLeaves solution;

	@Before
	public void setup() {
		solution = new SumOfLeftLeaves();
	}

	@Test
	public void testAddDigitsExample() {
		TreeNode root = new TreeNode(3);
		TreeNode node1 = new TreeNode(9);
		TreeNode node2 = new TreeNode(20);
		TreeNode node3 = new TreeNode(15);
		TreeNode node4 = new TreeNode(7);
		
		root.left = node1;
		root.right = node2;
		node2.left = node3;
		node2.right = node4;
		
		int result = solution.sumOfLeftLeaves(root);

		Assert.assertEquals(24, result);
	}

	@Test
	public void testAddDigitsAllRight() {
		TreeNode root = new TreeNode(3);
		TreeNode node1 = new TreeNode(9);
		TreeNode node2 = new TreeNode(20);
		TreeNode node3 = new TreeNode(15);
		TreeNode node4 = new TreeNode(7);
		
		root.right = node1;
		node1.right = node2;
		node2.right = node3;
		node3.right = node4;
		
		int result = solution.sumOfLeftLeaves(root);

		Assert.assertEquals(0, result);
	}

	@Test
	public void testAddDigitsAllLeft() {
		TreeNode root = new TreeNode(1);
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(3);
		TreeNode node3 = new TreeNode(4);
		TreeNode node4 = new TreeNode(5);
		
		root.left = node1;
		node1.left = node2;
		node2.left = node3;
		node3.left = node4;
		
		int result = solution.sumOfLeftLeaves(root);

		Assert.assertEquals(5, result);
	}

	@Test
	public void testAddDigitsOneLeft() {
		TreeNode root = new TreeNode(1);
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(3);
		TreeNode node3 = new TreeNode(4);
		TreeNode node4 = new TreeNode(5);
		
		root.right = node1;
		node1.right = node2;
		node2.left = node3;
		node3.right = node4;
		
		int result = solution.sumOfLeftLeaves(root);

		Assert.assertEquals(0, result);
	}
}
