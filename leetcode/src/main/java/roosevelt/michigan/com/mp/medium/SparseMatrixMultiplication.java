package roosevelt.michigan.com.mp.medium;

/**
 * Given two sparse matrices A and B, return the result of AB.
 * 
 * You may assume that A's column number is equal to B's row number.
 *
 *  A = [
 *    [ 1, 0, 0],
 *    [-1, 0, 3]
 *  ]
 *  
 *  
 *  B = [
 *    [ 7, 0, 0 ],
 *    [ 0, 0, 0 ],
 *    [ 0, 0, 1 ]
 *  ]
 *  
 *  
 *       |  1 0 0 |   | 7 0 0 |   |  7 0 0 |
 *  AB = | -1 0 3 | x | 0 0 0 | = | -7 0 3 |
 *                    | 0 0 1 |
 *                    
 * 
 * 
 * 
 * 
 * @author soup
 *
 */
public class SparseMatrixMultiplication {

	
    public int[][] multiply2(int[][] A, int[][] B) {
        int m = A.length, n = A[0].length, nB = B[0].length;
        int[][] C = new int[m][nB];

        for(int i = 0; i < m; i++) {
            for(int k = 0; k < n; k++) {
                if (A[i][k] != 0) {
                    for (int j = 0; j < nB; j++) {
                        if (B[k][j] != 0) C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
        }
        return C;   
    }
    
	public int[][] multiply(int[][] A, int[][] B) {
		if (A == null || A.length <= 0) {
			return new int[0][0];
		}

		int width = B[0].length;
		int height = A.length;

		int[][] result = new int[height][];
		for (int i = 0; i < height; i++) {
			result[i] = new int[width];
			for (int j = 0; j < width; j++) {
				result[i][j] = getMultiple(A, B, i, j);
			}
		}

		return result;
	}

	private int getMultiple(int A[][], int B[][], int i, int j) {
		int height = B.length;

		int value = 0;
		for (int k = 0; k < height; k++) {
			value += (A[i][k] * B[k][j]);
		}

		return value;
	}    
    
}
