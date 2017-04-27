package roosevelt.michigan.com.mp.easy;

import java.util.ArrayList;
import java.util.List;

import roosevelt.michigan.com.common.TreeNode;

/**
 * 
 * @author soup
 *
 */
public class BinaryTreePaths {

	public List<String> binaryTreePaths(TreeNode root) {
		if (root == null) {
			return new ArrayList<String>();
		}

		if (root.left == null && root.right == null) {
			List<String> leaf = new ArrayList<>();
			leaf.add(Integer.toString(root.val));
			return leaf;
		}

		if (root.left == null && root.right != null) {
			return append(this.binaryTreePaths(root.right), root.val);
		}

		if (root.right == null && root.left != null) {
			return append(this.binaryTreePaths(root.left), root.val);
		}

		if (root.right != null && root.left != null) {
			List<String> leftStrings = append(this.binaryTreePaths(root.left), root.val);
			List<String> rightStrings = append(this.binaryTreePaths(root.right), root.val);
			leftStrings.addAll(rightStrings);
			return leftStrings;
		}

		return null;
	}

	private List<String> append(List<String> paths, int value) {
		if (paths == null) {
			return null;
		}

		List<String> newPaths = new ArrayList<>();
		for (String path : paths) {
			newPaths.add(value + "->" + path);
		}

		return newPaths;
	}

}
