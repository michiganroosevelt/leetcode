package roosevelt.michigan.com.easy;

import roosevelt.michigan.com.common.TreeNode;

/**
 * 
 * @author soup
 *
 */
public class MergeTwoBinaryTrees {

	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if( t1 == null && t2 == null ) {
			return null;
		}
		
		int val = 0;
		if (t1 != null) {
			val += t1.val;
		}
		if (t2 != null) {
			val += t2.val;
		}

		TreeNode root = new TreeNode(val);

		TreeNode t1Left = null;
		TreeNode t1Right = null;
		if (t1 != null) {
			t1Left = t1.left;
			t1Right = t1.right;
		}

		TreeNode t2Left = null;
		TreeNode t2Right = null;
		if (t2 != null) {
			t2Left = t2.left;
			t2Right = t2.right;
		}
		
		if( t1Left != null || t2Left != null ) {
			root.left = mergeTrees(t1Left, t2Left);
		}
		
		if( t1Right != null || t2Right != null ) {
			root.right = mergeTrees(t1Right, t2Right);
		}

		return root;
	}

}
