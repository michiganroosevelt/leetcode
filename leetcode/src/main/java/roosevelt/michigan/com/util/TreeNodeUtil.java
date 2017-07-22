package roosevelt.michigan.com.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.junit.Assert;

import roosevelt.michigan.com.common.TreeNode;

public class TreeNodeUtil {

	private static String SPACE = " ";

	public static void assertEquals(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null) {
			return;
		}

		if (t1 == null && t2 != null) {
			Assert.fail("Nodes arent equal");
		}

		if (t1 != null && t2 == null) {
			Assert.fail("Nodes arent equal");
		}

		Assert.assertEquals(t1.val, t2.val);

		assertEquals(t1.left, t2.left);
		assertEquals(t1.right, t2.right);
	}

	public static String toStringBFS(TreeNode root) {
		if (root == null) {
			return null;
		}

		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);

		StringBuffer sb = new StringBuffer();
		sb.append(root.val);
		while (!q.isEmpty()) {
			TreeNode node = q.poll();

			if (node.left != null) {
				q.add(node.left);
				sb.append(SPACE + node.left.val);
			}
			if (node.right != null) {
				q.add(node.right);
				sb.append(SPACE + node.right.val);
			}
		}

		return sb.toString();
	}

	public static TreeNode build(Integer[] input) {
		List<Integer> convertedInput = new ArrayList<>();
		for (Integer val : input) {
			convertedInput.add(val);
		}

		return build(convertedInput);
	}

	public static TreeNode build(List<Integer> input) {
		Queue<Integer> feed = new LinkedList<>();
		for (Integer value : input) {
			feed.add(value);
		}

		Queue<TreeNode> tempQueue = new LinkedList<>();
		TreeNode node = new TreeNode(feed.poll());
		TreeNode root = node;

		tempQueue.add(node);
		TreeNode hookNode = null;
		Integer value = null;

		while (!feed.isEmpty()) {
			TreeNode currentNode = tempQueue.poll();
			if (currentNode != null) {
				hookNode = currentNode;
			}

			value = feed.poll();
			if (value != null) {
				TreeNode leftNode = new TreeNode(value);
				hookNode.left = leftNode;
				tempQueue.add(leftNode);
			}

			if (!feed.isEmpty()) {
				value = feed.poll();
				if (value != null) {
					TreeNode rightNode = new TreeNode(value);
					hookNode.right = rightNode;
					tempQueue.add(rightNode);
				}
			}
		}

		return root;
	}

}
