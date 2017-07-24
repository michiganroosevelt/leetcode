package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import roosevelt.michigan.com.common.TreeNode;
import roosevelt.michigan.com.util.TreeNodeUtil;

public class SubtreeOfAnotherTreeTest {

	private SubtreeOfAnotherTree solution;

	@Before
	public void setup() {
		solution = new SubtreeOfAnotherTree();
	}

	@Test
	public void testAddDigitsExample() {
		TreeNode t = TreeNodeUtil.build(new Integer[] { 3, 4, 5, 1, 2 });
		TreeNode s = TreeNodeUtil.build(new Integer[] { 4, 1, 2 });

		boolean result = solution.isSubtree(t, s);

		Assert.assertEquals(true, result);
	}
}
