package roosevelt.michigan.com.mp.easy;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import roosevelt.michigan.com.common.TreeNode;

public class BinaryTreePathsTest {

	private BinaryTreePaths solution;

	@Before
	public void setup() {
		solution = new BinaryTreePaths();
	}

	@Test
	public void testBinaryTreePathsIso() {
		
		TreeNode root = new TreeNode(1);
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(3);
		TreeNode node3 = new TreeNode(4);
		
		root.left = node1;
		node1.left = node2;
		node1.right = node3;
		
		List<String> result = solution.binaryTreePaths(root);

		Assert.assertEquals(2, result.size());
		Assert.assertEquals("1->2->3", result.get(0));
		Assert.assertEquals("1->2->4", result.get(1));
	}

	public void testAddDigitsExample() {
		
		TreeNode root = new TreeNode(1);
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(3);
		TreeNode node3 = new TreeNode(5);
		
		root.left = node1;
		node1.right = node3;
		root.right = node2;
		
		List<String> result = solution.binaryTreePaths(root);

		Assert.assertEquals(2, result.size());
		Assert.assertEquals("1->2->5", result.get(0));
		Assert.assertEquals("1->3", result.get(1));
	}
}
