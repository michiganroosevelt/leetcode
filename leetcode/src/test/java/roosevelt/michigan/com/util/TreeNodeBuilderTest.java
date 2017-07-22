package roosevelt.michigan.com.util;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import roosevelt.michigan.com.common.TreeNode;

public class TreeNodeBuilderTest {

	private TreeNode fullTree1;

	private TreeNode fullTree2;

	@Before
	public void setUp() {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);

		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;

		fullTree1 = node1;

		TreeNode node1_1 = new TreeNode(1);
		TreeNode node1_2 = new TreeNode(2);
		TreeNode node1_3 = new TreeNode(3);
		TreeNode node1_4 = new TreeNode(4);
		TreeNode node1_5 = new TreeNode(5);
		TreeNode node1_6 = new TreeNode(6);
		TreeNode node1_7 = new TreeNode(7);

		node1_1.left = node1_2;
		node1_1.right = node1_3;
		node1_2.left = node1_4;
		node1_2.right = node1_5;
		node1_3.left = node1_6;
		node1_3.right = node1_7;

		fullTree1 = node1;
		fullTree2 = node1_1;
	}

	@Test
	public void testTreeNodeUtilPrintBFS() {
		String result = TreeNodeUtil.toStringBFS(fullTree1);
		Assert.assertEquals("1 2 3 4 5 6 7", result);
	}

	@Test
	public void testTreeNodeUtilAssertEquals() {
		TreeNodeUtil.assertEquals(fullTree1, fullTree2);
	}

	@Test(expected = AssertionError.class)
	public void testTreeNodeUtilAssertEqualsWithDifferentTrees() {
		TreeNode root = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		root.left = node2;
		root.right = node3;

		TreeNodeUtil.assertEquals(fullTree1, root);
	}

	@Test(expected = AssertionError.class)
	public void testTreeNodeUtilAssertEqualsWithDifferentValues() {
		fullTree1.val = 10;

		TreeNodeUtil.assertEquals(fullTree1, fullTree2);
	}

	@Test
	public void testTreeNodeUtilFullTreeList() {
		List<Integer> input = new ArrayList<>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		input.add(6);
		input.add(7);

		TreeNode result = TreeNodeUtil.build(input);
		TreeNodeUtil.assertEquals(fullTree1, result);
	}

	@Test
	public void testTreeNodeUtilFullTreeArray() {
		Integer[] input = new Integer[] { 1, 2, 3, 4, 5, 6, 7 };

		TreeNode result = TreeNodeUtil.build(input);
		TreeNodeUtil.assertEquals(fullTree1, result);
	}

	@Test
	public void testTreeNodeUtilFullTreeSizeEight() {
		Integer[] input = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		fullTree1.left.left.left = new TreeNode(8);

		TreeNode result = TreeNodeUtil.build(input);
		TreeNodeUtil.assertEquals(fullTree1, result);
	}

	@Test
	public void testBuildSparceTree() {
		TreeNode root = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		root.left = node2;
		root.right = node3;
		node2.right = node5;
		node3.left = node6;

		Integer[] input = new Integer[] { 1, 2, 3, null, 5, 6 };

		TreeNode result = TreeNodeUtil.build(input);
		TreeNodeUtil.assertEquals(root, result);
	}

	@Test
	public void testBuildWithPerimeterTree() {
		TreeNode root = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node7 = new TreeNode(7);
		root.left = node2;
		root.right = node3;
		node2.left = node4;
		node3.right = node7;

		Integer[] input = new Integer[] { 1, 2, 3, 4, null, null, 7 };

		TreeNode result = TreeNodeUtil.build(input);
		TreeNodeUtil.assertEquals(root, result);
	}

	@Test
	public void testBuildLeftBalancedTreeWithRightNode() {
		TreeNode root = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node5 = new TreeNode(5);
		root.left = node2;
		node2.right = node5;

		Integer[] input = new Integer[] { 1, 2, null, null, 5 };

		TreeNode result = TreeNodeUtil.build(input);
		TreeNodeUtil.assertEquals(root, result);
	}

	@Test
	public void testBuildLeftBalancedTree() {
		TreeNode root = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node4 = new TreeNode(4);
		TreeNode node8 = new TreeNode(8);
		root.left = node2;
		node2.left = node4;
		node4.left = node8;

		Integer[] input = new Integer[] { 1, 2, null, 4, null, null, null, 8 };

		TreeNode result = TreeNodeUtil.build(input);
		TreeNodeUtil.assertEquals(root, result);
	}

}
