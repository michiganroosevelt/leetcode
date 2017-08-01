
package roosevelt.michigan.com.easy;

import org.junit.Before;
import org.junit.Test;

import roosevelt.michigan.com.common.TreeNode;
import roosevelt.michigan.com.util.TreeNodeUtil;

public class ConvertBSTtoGreaterTreeTest {

	private ConvertBSTtoGreaterTree solution;

	@Before
	public void setup() {
		solution = new ConvertBSTtoGreaterTree();
	}

	@Test
	public void testAddDigitsExample() {
		TreeNode result = solution.convertBST(TreeNodeUtil.build(new Integer[] { 5, 2, 13 }));

		TreeNode expect = TreeNodeUtil.build(new Integer[] { 18, 20, 13 });
		TreeNodeUtil.assertEquals(expect, result);
	}
}
