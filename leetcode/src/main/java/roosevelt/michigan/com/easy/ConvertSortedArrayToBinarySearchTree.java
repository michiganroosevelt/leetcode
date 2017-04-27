package roosevelt.michigan.com.easy;

import roosevelt.michigan.com.common.TreeNode;

/**
 * 
 * @author soup
 *
 */
public class ConvertSortedArrayToBinarySearchTree  {

	public TreeNode sortedArrayToBST(int[] nums) {
		
		
		int middle = nums[nums.length/2];
		int low = 0;
		int high = nums.length/2;
		TreeNode root = new TreeNode(nums[nums.length/2]);
		while( low < high) {
			root.left = new TreeNode(low);
//			root.right = new Treen
			
			
		}
		
		
		
		
		
		return root;
    }
}
