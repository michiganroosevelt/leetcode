package roosevelt.michigan.com.medium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SpiralMatrixIITest {

	private SpiralMatrixII solution;

	@Before
	public void setup() {
		solution = new SpiralMatrixII();
	}

	@Test
	public void SpiralMatrixIITestExample() {
		int[][] result = solution.generateMatrix(3);

		Assert.assertEquals(1, result[0][0]);
		Assert.assertEquals(2, result[0][1]);
		Assert.assertEquals(3, result[0][2]);

		Assert.assertEquals(8, result[1][0]);
		Assert.assertEquals(9, result[1][1]);
		Assert.assertEquals(4, result[1][2]);

		Assert.assertEquals(7, result[2][0]);
		Assert.assertEquals(6, result[2][1]);
		Assert.assertEquals(5, result[2][2]);
	}
	@Test
	public void testSpiralMatrixIITestOne() {
		int[][] result = solution.generateMatrix(1);
		Assert.assertEquals(1, result[0][0]);
	}
	
	@Test
	public void testSpiralMatrixIITestFour() {
		int[][] result = solution.generateMatrix(4);

		Assert.assertEquals(1, result[0][0]);
		Assert.assertEquals(2, result[0][1]);
		Assert.assertEquals(3, result[0][2]);
		Assert.assertEquals(4, result[0][3]);

		Assert.assertEquals(12, result[1][0]);
		Assert.assertEquals(13, result[1][1]);
		Assert.assertEquals(14, result[1][2]);
		Assert.assertEquals(5, result[1][3]);

		Assert.assertEquals(11, result[2][0]);
		Assert.assertEquals(16, result[2][1]);
		Assert.assertEquals(15, result[2][2]);
		Assert.assertEquals(6, result[2][3]);

		Assert.assertEquals(10, result[3][0]);
		Assert.assertEquals(9, result[3][1]);
		Assert.assertEquals(8, result[3][2]);
		Assert.assertEquals(7, result[3][3]);

	}
}
