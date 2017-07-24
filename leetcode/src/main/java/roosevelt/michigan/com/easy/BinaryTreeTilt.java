package roosevelt.michigan.com.easy;

import roosevelt.michigan.com.common.TreeNode;

/**
 * 
 * @author soup
 *
 */
public class BinaryTreeTilt {

    public int findTilt(TreeNode root) {
    	if( root == null ) {
    		return 0;
    	}
    	
    	if( root.left == null && root.right == null ) {
    		return root.val;
    	}
    	
    	int leftSum = 0;
    	if( root.left != null ) {
    		leftSum = findTilt(root.left);
    	}
    	
    	int rightSum = 0;
    	if( root.right != null ) {
    		rightSum = findTilt(root.right);
    	}
    	return Math.abs(rightSum-leftSum);
    }
	
}
