package roosevelt.michigan.com.misc;

import org.junit.Assert;

import roosevelt.michigan.com.common.TreeNode;

public class Utils {

	
	public static void printBFS(TreeNode root) {
		if( root == null ) {
			return;
		}
		
		
		
		if( root.left != null ) {
			System.out.println(root.left.val);
		}
		if( root.right != null ) {
			System.out.println(root.right.val);
		}
		
		printBFS(root.left);
		printBFS(root.right);
		
		
		
		
		
		
	}
	
	
	public static TreeNode generateTree(int[] input) {
		TreeNode node = null;
		
		for( int val : input) {
			node = new TreeNode(val);
			
		}
		
		return null;
	}
	
	
	
	public static void verifyMatrix(int[] verify, int[] input) {
		Assert.assertEquals(verify.length, input.length);
		for( int i = 0; i < verify.length; i++ ) {
			Assert.assertEquals(verify[i], input[i]);
		}
	}
	
	public static int[][] buildMatrix(int[] input, int height, int width) {
		int[][] result = new int[height][width];
		int i = 0;
		int j = 0;
		
		for( int count = 0; count < height*width; count++ ) {
			
			if( j>= width ) {
				i++;
				j = 0;
			}
			result[i][j] = input[count];
			j++;
		}
		
		
		return result;
	}
	
	
	
}
