package roosevelt.michigan.com.medium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import roosevelt.michigan.com.misc.Utils;

public class DiagonalTraverseTest {

	private DiagonalTraverse solution;

	@Before
	public void setup() {
		solution = new DiagonalTraverse();
	}

	@Test
	public void tesDiagonalTraverseExample() {
		int[][] input = Utils.buildMatrix(new int[]{1,2,3,4,5,6,7,8,9}, 3, 3);
		int[] result = solution.findDiagonalOrder(input);

		Utils.verifyMatrix(new int[]{1,2,3,4,5,6,7,8,9}, result);
		Assert.assertEquals(1, result[0]);
		Assert.assertEquals(2, result[1]);
		Assert.assertEquals(4, result[2]);
		Assert.assertEquals(7, result[3]);
		Assert.assertEquals(5, result[4]);
		Assert.assertEquals(3, result[5]);
		Assert.assertEquals(6, result[6]);
		Assert.assertEquals(8, result[7]);
		Assert.assertEquals(9, result[8]);
	}

	@Test
	public void testAddDigitsExample() {
		int[][] input = Utils.buildMatrix(new int[]{1,2,3,4,5,6,7,8,9}, 9, 1);
		int[] result = solution.findDiagonalOrder(input);

		Assert.assertEquals(1, result[0]);
		Assert.assertEquals(2, result[1]);
		Assert.assertEquals(4, result[2]);
		Assert.assertEquals(7, result[3]);
		Assert.assertEquals(5, result[4]);
		Assert.assertEquals(3, result[5]);
		Assert.assertEquals(6, result[6]);
		Assert.assertEquals(8, result[7]);
		Assert.assertEquals(9, result[8]);
	}
}
