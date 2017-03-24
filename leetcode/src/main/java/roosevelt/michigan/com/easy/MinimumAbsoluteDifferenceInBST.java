package roosevelt.michigan.com.easy;

import roosevelt.michigan.com.common.TreeNode;

/**
 * Given a binary search tree with non-negative values, find the minimum
 * absolute difference between values of any two nodes.
 * 
 * Example:
 * 
 * Input:
 * 
 * 1 \ 3 / 2
 * 
 * Output: 1
 * 
 * Explanation: The minimum absolute difference is 1, which is the difference
 * between 2 and 1 (or between 2 and 3).
 * 
 * 
 * @author soup
 *
 */
public class MinimumAbsoluteDifferenceInBST {
	
    public int getMinimumDifference(TreeNode root) {
    	if( root == null ) {
    		return 0;
    	}
    	
    	int leftMin = getMinimumDifference(root.left);
    	int rightMin = getMinimumDifference(root.right);
    	
    	int current = root.val;
    	
    	
    	
    	return leftMin;
    }
}
