package roosevelt.michigan.com.easy;

import roosevelt.michigan.com.common.TreeNode;

/**
 * 
 * @author soup
 *
 */
public class ConstructStringFromBinaryTree {

	public String tree2str(TreeNode t) {
		StringBuilder sb = new StringBuilder();
		generateString(t, sb);
		System.out.println(sb.toString());

		return sb.toString();
	}

	private void generateString(TreeNode node, StringBuilder sb) {
		if (node == null) {
			return;
		}

		sb.append(node.val);
		if (node.left != null || node.right != null) {
			sb.append("(");
			generateString(node.left, sb);
			sb.append(")");
			if (node.right != null) {
				sb.append("(");
				generateString(node.right, sb);
				sb.append(")");
			}
		}
	}

}
