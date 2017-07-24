package roosevelt.michigan.com.easy;

import roosevelt.michigan.com.common.TreeNode;

/**
 * 
 * @author soup
 *
 */
public class DiameterOfBinaryTree {

	public int diameterOfBinaryTree(TreeNode root) {
		int[] values = new int[] { 0 };
		calculate(root, values);
		return values[0];
	}

	public int calculate(TreeNode node, int[] values) {
		if (node == null) {
			return 0;
		}

		int lh = calculate(node.left, values);
		int rh = calculate(node.right, values);
		values[0] = Math.max(values[0], lh + rh);
		return 1 + Math.max(lh, rh);
	}
}
