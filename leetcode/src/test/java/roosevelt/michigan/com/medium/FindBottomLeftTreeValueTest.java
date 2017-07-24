package roosevelt.michigan.com.medium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import roosevelt.michigan.com.common.TreeNode;
import roosevelt.michigan.com.util.TreeNodeUtil;

public class FindBottomLeftTreeValueTest {

	private FindBottomLeftTreeValue solution;

	@Before
	public void setup() {
		solution = new FindBottomLeftTreeValue();
	}

	@Test
	public void testFindBottomLeftTreeValueBalanced() {
		TreeNode input = TreeNodeUtil.build(new Integer[]{2,1,3});
		int result = solution.findBottomLeftValue(input);

		Assert.assertEquals(1, result);
	}

	@Test
	public void testFindBottomLeftTreeValueUnbalanced() {
		TreeNode input = TreeNodeUtil.build(new Integer[]{1,2,3,4,null,5,6,null,null,7});
		int result = solution.findBottomLeftValue(input);

		Assert.assertEquals(7, result);
	}
}
