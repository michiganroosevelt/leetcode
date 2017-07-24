package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import roosevelt.michigan.com.util.TreeNodeUtil;

public class ConstructStringFromBinaryTreeTest {

	private ConstructStringFromBinaryTree solution;

	@Before
	public void setup() {
		solution = new ConstructStringFromBinaryTree();
	}

	@Test
	public void testConstructStringFromBinaryTree() {
		String result = solution.tree2str(TreeNodeUtil.build(new Integer[]{1,2,3,4}));
		Assert.assertEquals("1(2(4))(3)", result);
	}

	@Test
	public void testConstructStringFromBinaryTreeWithNull() {
		String result = solution.tree2str(TreeNodeUtil.build(new Integer[]{1,2,3,null,4}));
		Assert.assertEquals("1(2()(4))(3)", result);
	}

}
