
package roosevelt.michigan.com.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import roosevelt.michigan.com.common.TreeNode;

/**
 * 
 * @author soup
 *
 */
public class ConvertBSTtoGreaterTree {

	public TreeNode convertBST(TreeNode root) {
		List<Integer> values = new ArrayList<>();
		getSum(root, values);
		addValues(root, values);
		Collections.sort(values);

		return root;
	}

	private int getGreater(List<Integer> values, int target) {
		int sum = 0;

		for (int i = values.size() - 1; i >= 0; i--) {
			if (values.get(i).intValue() >= target) {
				sum += values.get(i);
			}
		}

		return sum;
	}

	public void addValues(TreeNode node, List<Integer> values) {
		if (node == null) {
			return;
		}

		node.val = getGreater(values, node.val);
		addValues(node.left, values);
		addValues(node.right, values);
	}

	public void getSum(TreeNode node, List<Integer> values) {
		if (node == null) {
			return;
		}

		values.add(node.val);
		getSum(node.left, values);
		getSum(node.right, values);
	}

}
