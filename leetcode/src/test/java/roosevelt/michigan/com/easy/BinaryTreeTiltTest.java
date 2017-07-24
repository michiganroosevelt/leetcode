package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import roosevelt.michigan.com.util.TreeNodeUtil;

public class BinaryTreeTiltTest {

	private BinaryTreeTilt solution;

	@Before
	public void setup() {
		solution = new BinaryTreeTilt();
	}

	@Test
	public void testBinaryTreeTilt() {
		int result = solution.findTilt(TreeNodeUtil.build(new Integer[]{1,2,3}));

		Assert.assertEquals(1, result);
	}

	@Test
	public void testBinaryTreeTiltSparse() {
		int result = solution.findTilt(TreeNodeUtil.build(new Integer[]{1,2,3,4,null,5}));

		Assert.assertEquals(11, result);
	}

}


