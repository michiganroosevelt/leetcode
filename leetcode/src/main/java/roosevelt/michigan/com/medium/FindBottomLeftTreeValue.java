package roosevelt.michigan.com.medium;

import roosevelt.michigan.com.common.TreeNode;

/**
 * 
 * @author soup
 *
 */
public class FindBottomLeftTreeValue {

	public int findBottomLeftValue(TreeNode root) {
		NodeInfo info = findBottom(root, new int[] { 1, 1 });
		return info.node.val;
	}

	private NodeInfo findBottom(TreeNode node, int[] position) {
		int level = position[0];
		int column = position[1];
		NodeInfo leftNode = null;
		NodeInfo rightNode = null;

		System.out.println(node.val + " " + level + " " + column);
		if (node.left != null) {
			leftNode = findBottom(node.left, new int[] { level + 1, column + 1 });
		}

		if (node.right != null) {
			rightNode = findBottom(node.right, new int[] { level + 1, column - 1 });
		}

		if (leftNode == null && rightNode == null) {
			return new NodeInfo(node, level, column);
		}

		if (leftNode != null && rightNode != null) {
			if (leftNode.level > rightNode.level) {
				return leftNode;
			} else if (rightNode.level > leftNode.level) {
				return rightNode;
			} else {
				if (rightNode.column > leftNode.column) {
					return rightNode;
				} else {
					return leftNode;
				}

			}
		} else if (rightNode != null) {
			return rightNode;
		} else {
			return leftNode;
		}
	}

	private class NodeInfo {
		TreeNode node;
		int level = 0;
		int column = 0;

		NodeInfo(TreeNode node, int level, int column) {
			this.node = node;
			this.level = level;
			this.column = column;
		}
	}

}
