package roosevelt.michigan.com.easy;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import roosevelt.michigan.com.common.TreeNode;
import roosevelt.michigan.com.util.TreeNodeUtil;

public class BinaryTreeLevelOrderTraversalIITest {

	private BinaryTreeLevelOrderTraversalII solution;

	@Before
	public void setup() {
		solution = new BinaryTreeLevelOrderTraversalII();
	}

	@Test
	public void testBinaryTreeLevelOrderTraversalII() {
		TreeNode input = TreeNodeUtil.build(new Integer[] { 1, 2, 3, 4, 5, 6, 7 });
		List<List<Integer>> result = solution.levelOrderBottom(input);

		Assert.assertEquals(4, result.get(0).get(0).intValue());
		Assert.assertEquals(5, result.get(0).get(1).intValue());
		Assert.assertEquals(6, result.get(0).get(2).intValue());
		Assert.assertEquals(7, result.get(0).get(3).intValue());

		Assert.assertEquals(2, result.get(1).get(0).intValue());
		Assert.assertEquals(3, result.get(1).get(1).intValue());

		Assert.assertEquals(1, result.get(2).get(0).intValue());
	}
}
