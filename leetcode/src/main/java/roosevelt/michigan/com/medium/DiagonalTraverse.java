package roosevelt.michigan.com.medium;

/**
 * Given a matrix of M x N elements (M rows, N columns), return all elements of
 * the matrix in diagonal order as shown in the below image.
 * 
 * Example:
 * 
 * Input: [ [ 1, 2, 3 ], [ 4, 5, 6 ], [ 7, 8, 9 ] ] Output: [1,2,4,7,5,3,6,8,9]
 * 
 * @author soup
 *
 */
public class DiagonalTraverse {

	public int[] findDiagonalOrder(int[][] matrix) {

		int rightCount = 0;
		int downCount = 0;
		int width = matrix.length;
		int height = matrix[0].length;
		int result[] = new int[height * width];
		boolean moveUp = true;

		for (int count = 0; count < height * width; count++) {
			int i = calcIndex(width, height, rightCount);
			int j = calcIndex(height, width, downCount);
			if (moveUp) {
				count = travelUp(matrix, result, count, i, j);
				rightCount++;
			} else {
				count = travelDown(matrix, result, count, i, j);
				downCount++;
			}
			
			moveUp = !moveUp;
		}

		return result;
	}
	
	public int calcIndex(int target, int height, int index) {
		if (index + 1 >= target) {
			return index - target + 1;
		}
		return index++;
	}


	public int travelDown(int[][] input, int[] result, int count, int i, int j) {
		while (i < input.length && j >= 0) {
			result[count] = input[i][j];
			count++;
			i++;
			j--;
		}

		return count;
	}

	public int travelUp(int[][] input, int[] result, int count, int i, int j) {
		while (j < input[0].length && i >= 0) {
			result[count] = input[i][j];
			count++;
			i--;
			j++;
		}

		return count;
	}

}
