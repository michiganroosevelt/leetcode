package roosevelt.michigan.com.easy;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import roosevelt.michigan.com.util.TreeNodeUtil;

public class AverageOfLevelsInBinaryTreeTest {

	private AverageOfLevelsInBinaryTree solution;

	@Before
	public void setup() {
		solution = new AverageOfLevelsInBinaryTree();
	}

	@Test
	public void testAddDigitsExample() {
		List<Double> result = solution.averageOfLevels(TreeNodeUtil.build(new Integer[] { 1, 2, 2, 3, 3, 3, 3 }));

		Assert.assertEquals(3, result.size());

		Assert.assertEquals(1, result.get(0).doubleValue(), 0);
		Assert.assertEquals(2, result.get(1).doubleValue(), 0);
		Assert.assertEquals(3, result.get(2).doubleValue(), 0);
	}
}
