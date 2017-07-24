package roosevelt.michigan.com.easy;

import roosevelt.michigan.com.common.TreeNode;

/**
 * 
 * @author soup
 *
 */
public class SubtreeOfAnotherTree {

	public boolean isSubtree(TreeNode s, TreeNode t) {
		if (s == null) {
			return false;
		}

		if (isSameTree(s, t)) {
			return true;
		}

		if (isSubtree(s.left, t)) {
			return true;
		}

		if (isSubtree(s.right, t)) {
			return true;
		}

		return false;
	}

	private boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		}

		if (p == null && q != null) {
			return false;
		}

		if (p != null && q == null) {
			return false;
		}

		if (p.val != q.val) {
			return false;
		}

		if (!isSameTree(p.left, q.left)) {
			return false;
		}

		if (!isSameTree(p.right, q.right)) {
			return false;
		}
		return true;
	}

}
