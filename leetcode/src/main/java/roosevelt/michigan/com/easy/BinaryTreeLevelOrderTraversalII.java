package roosevelt.michigan.com.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import roosevelt.michigan.com.common.TreeNode;

/**
 * 
 * @author soup
 *
 */
public class BinaryTreeLevelOrderTraversalII {

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		if (root == null) {
			return new ArrayList<>();
		}

		List<List<Integer>> result = new ArrayList<>();
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		traverse(q, result, 1);

		List<List<Integer>> reversed = new ArrayList<>();
		for (int i = result.size() - 1; i >= 0; i--) {
			reversed.add(result.get(i));
		}

		return reversed;
	}

	public void traverse(Queue<TreeNode> q, List<List<Integer>> result, int depth) {
		if (result.size() < depth) {
			result.add(new ArrayList<Integer>());
		}

		if (q.isEmpty()) {
			return;
		}

		TreeNode node = q.poll();
		if (node == null) {
			return;
		}

		result.get(depth - 1).add(node.val);
		if (node.left != null) {
			q.add(node.left);
			traverse(q, result, (depth + 1));
		}
		if (node.right != null) {
			q.add(node.right);
			traverse(q, result, (depth + 1));
		}
	}

}
