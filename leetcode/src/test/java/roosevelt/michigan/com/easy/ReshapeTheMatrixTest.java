package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReshapeTheMatrixTest {

	private ReshapeTheMatrix solution;

	@Before
	public void setup() {
		solution = new ReshapeTheMatrix();
	}

	@Test
	public void testReshapeTheMatrixExample() {
		int[][] input = new int[][] { { 1, 2 }, { 3, 4 } };
		int[][] result = solution.matrixReshape(input, 1, 4);

		Assert.assertEquals(1, result[0][0]);
		Assert.assertEquals(2, result[0][1]);
		Assert.assertEquals(3, result[0][2]);
		Assert.assertEquals(4, result[0][3]);
	}

	@Test
	public void testReshapeTheMatrix1X4into2X2() {
		int[][] input = new int[][] { { 1, 2, 3, 4 } };
		int[][] result = solution.matrixReshape(input, 2, 2);

		Assert.assertEquals(1, result[0][0]);
		Assert.assertEquals(2, result[0][1]);
		Assert.assertEquals(3, result[1][0]);
		Assert.assertEquals(4, result[1][1]);
	}
}
