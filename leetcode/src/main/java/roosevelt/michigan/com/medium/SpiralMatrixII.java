package roosevelt.michigan.com.medium;

/**
 * Given an integer n, generate a square matrix filled with elements from 1 to
 * n2 in spiral order.
 * 
 * For example, Given n = 3, You should return the following matrix:
 * 
 * [ [ 1, 2, 3 ], [ 8, 9, 4 ], [ 7, 6, 5 ] ]
 * 
 * @author soup
 *
 */
public class SpiralMatrixII {

	public int[][] generateMatrix(int n) {
		int[][] result = new int[n][n];

		boolean isRight = true;
		boolean isDown = false;
		boolean isLeft = false;
		boolean isUp = false;

		int limit = n * n;
		int counter = 0;
		int i = 0, j = 0;

		while (counter < limit) {
			counter++;
			result[i][j] = counter;

			if (isRight) {
				if (j + 1 >= n || result[i][j + 1] > 0) {
					isRight = false;
					isDown = true;
					i++;
				} else {
					j++;
				}
			} else if (isDown) {
				if (i + 1 >= n || result[i + 1][j] > 0) {
					isDown = false;
					isLeft = true;
					j--;
				} else {
					i++;
				}
			} else if (isLeft) {
				if (j - 1 < 0 || result[i][j - 1] > 0) {
					isLeft = false;
					isUp = true;
					i--;
				} else {
					j--;
				}
			} else if (isUp) {
				if (i - 1 < 0 || result[i - 1][j] > 0) {
					isUp = false;
					isRight = true;
					j++;
				} else {
					i--;
				}
			}

		}

		return result;
	}
}
