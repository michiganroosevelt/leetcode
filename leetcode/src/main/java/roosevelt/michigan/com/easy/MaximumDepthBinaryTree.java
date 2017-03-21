package roosevelt.michigan.com.easy;

/**
 * 
 * Given a binary tree, find its maximum depth.
 * 
 * The maximum depth is the number of nodes along the longest path from the root
 * node down to the farthest leaf node.
 * 
 * @author soup
 *
 */
public class MaximumDepthBinaryTree {

	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}

		int leftMax = 0;
		int rightMax = 0;

		leftMax = maxDepth(root.left);
		rightMax = maxDepth(root.right);

		return 1 + (leftMax > rightMax ? leftMax : rightMax);
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

}
