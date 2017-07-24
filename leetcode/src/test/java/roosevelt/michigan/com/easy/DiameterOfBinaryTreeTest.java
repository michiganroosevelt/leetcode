package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import roosevelt.michigan.com.util.TreeNodeUtil;

public class DiameterOfBinaryTreeTest {

	private DiameterOfBinaryTree solution;

	@Before
	public void setup() {
		solution = new DiameterOfBinaryTree();
	}

	@Test
	public void testAddDigitsExample() {
		int result = solution.diameterOfBinaryTree(TreeNodeUtil.build(new Integer[] { 1, 2, 3, 4, 5 }));

		Assert.assertEquals(3, result);
	}
}
