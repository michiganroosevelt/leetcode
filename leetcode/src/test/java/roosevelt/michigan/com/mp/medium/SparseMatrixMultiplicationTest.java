package roosevelt.michigan.com.mp.medium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SparseMatrixMultiplicationTest {

	private SparseMatrixMultiplication solution;

	@Before
	public void setup() {
		solution = new SparseMatrixMultiplication();
	}

	@Test
	public void testSparseMatrixMultiplicationTestAllZeros() {

		int[][] a = new int[1][];
		a[0] = new int[] { 0, 0, 0 };

		int[][] b = new int[3][];
		b[0] = new int[] { 0, 0 };
		b[1] = new int[] { 0, 0 };
		b[2] = new int[] { 0, 0 };

		int[][] result = solution.multiply(a, b);

		Assert.assertArrayEquals(new int[] { 0, 0 }, result[0]);
	}

	@Test
	public void testSparseMatrixMultiplicationTest1By2() {

		int[][] a = new int[1][];
		a[0] = new int[] { 1, 4, 6 };

		int[][] b = new int[3][];
		b[0] = new int[] { 2, 3 };
		b[1] = new int[] { 5, 8 };
		b[2] = new int[] { 7, 9 };

		int[][] result = solution.multiply(a, b);

		Assert.assertArrayEquals(new int[] { 64, 89 }, result[0]);
	}

	@Test
	public void testSparseMatrixMultiplicationTest2by3() {

		int[][] a = new int[3][];
		a[0] = new int[] { 4, 8 };
		a[1] = new int[] { 0, 2 };
		a[2] = new int[] { 1, 6 };

		int[][] b = new int[2][];
		b[0] = new int[] { 5, 2 };
		b[1] = new int[] { 9, 4 };

		int[][] result = solution.multiply2(a, b);

		Assert.assertArrayEquals(new int[] { 92, 40 }, result[0]);
		Assert.assertArrayEquals(new int[] { 18, 8 }, result[1]);
		Assert.assertArrayEquals(new int[] { 59, 26 }, result[2]);
	}

	@Test
	public void testSparseMatrixMultiplicationTestExample() {

		int[][] a = new int[2][];
		a[0] = new int[] { 1, 0, 0 };
		a[1] = new int[] { -1, 0, 3 };

		int[][] b = new int[3][];
		b[0] = new int[] { 7, 0, 0 };
		b[1] = new int[] { 0, 0, 0 };
		b[2] = new int[] { 0, 0, 1 };

		int[][] result = solution.multiply(a, b);

		Assert.assertArrayEquals(new int[] { 7, 0, 0 }, result[0]);
		Assert.assertArrayEquals(new int[] { -7, 0, 3 }, result[1]);
	}

}
