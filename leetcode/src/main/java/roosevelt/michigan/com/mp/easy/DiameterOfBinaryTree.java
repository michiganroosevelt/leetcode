package roosevelt.michigan.com.mp.easy;

import roosevelt.michigan.com.common.TreeNode;

/**
 * 
 * @author soup
 *
 */
public class DiameterOfBinaryTree {

    public int diameterOfBinaryTree(TreeNode root) {
    	
    	int depth = findMaxDepth(root);
    	return depth;
    }	
    
    public int findMaxDepth(TreeNode root) {
    	if( root == null ) {
    		return 0;
    	}
    	
    	int leftDepth = 1 + findMaxDepth(root.left);
    	int rightDepth = 1 + findMaxDepth(root.right);
    	
    	return leftDepth + rightDepth;
    }
}
