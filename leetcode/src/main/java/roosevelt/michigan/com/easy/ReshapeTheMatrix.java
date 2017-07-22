package roosevelt.michigan.com.easy;

/**
 * 
 * @author soup
 *
 */
public class ReshapeTheMatrix {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
    	int height = nums.length;
    	int width = nums[0].length;
    	
    	if( height*width != r*c) {
    		return nums;
    	}
    	
    	int result[][] = new int[r][c];
    	int newI = 0;
    	int newJ = 0;
    	
    	for( int i = 0; i < height; i++ ) {
    		for( int j = 0; j < width; j++ ) {
    			if( newJ >= c) {
    				newI++;
    				newJ = 0;
    			}
    			result[newI][newJ] = nums[i][j];
    			newJ++;
    		}
    	}
    	
        return result;
    }
	
}
