package roosevelt.michigan.com.easy;

import java.util.ArrayList;
import java.util.List;

import roosevelt.michigan.com.common.TreeNode;

/**
 * 
 * @author soup
 *
 */
public class AverageOfLevelsInBinaryTree {

	public List<Double> averageOfLevels(TreeNode root) {
		List<Double[]> average = new ArrayList<>();
		calculate(root, 0, average);

		List<Double> result = new ArrayList<>();
		for (Double[] value : average) {
			result.add(value[0] / value[1]);
		}

		return result;
	}

	public void calculate(TreeNode root, int level, List<Double[]> average) {
		if (average.size() == level) {
			average.add(new Double[] { 0d, 0d });
		}

		Double[] current = average.get(level);
		current[0] += root.val;
		current[1]++;
		if (root.left != null) {
			calculate(root.left, (level + 1), average);
		}

		if (root.right != null) {
			calculate(root.right, (level + 1), average);
		}
	}

}
