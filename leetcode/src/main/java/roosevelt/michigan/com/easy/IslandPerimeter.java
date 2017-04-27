package roosevelt.michigan.com.easy;

/**
 * You are given a map in form of a two-dimensional integer grid where 1
 * represents land and 0 represents water. Grid cells are connected
 * horizontally/vertically (not diagonally). The grid is completely surrounded
 * by water, and there is exactly one island (i.e., one or more connected land
 * cells). The island doesn't have "lakes" (water inside that isn't connected to
 * the water around the island). One cell is a square with side length 1. The
 * grid is rectangular, width and height don't exceed 100. Determine the
 * perimeter of the island.
 * 
 * [[0,1,0,0], [1,1,1,0], [0,1,0,0], [1,1,0,0]]
 * 
 * Answer: 16 Explanation: The perimeter is the 16 yellow stripes in the image
 * below:
 * 
 * @author soup
 *
 */
public class IslandPerimeter {

	public int islandPerimeter(int[][] grid) {
		int height = grid.length;
		int width = grid[0].length;

		int total = 0;
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if( grid[i][j] != 1 ) {
					continue;
				}

				if (i == 0 || grid[i - 1][j] == 0) {
					total++;
				}

				if (j + 1 >= width || grid[i][j + 1] == 0) {
					total++;
				}

				if (i + 1 >= height || grid[i + 1][j] == 0) {
					total++;
				}

				if (j == 0 || grid[i][j - 1] == 0) {
					total++;
				}

			}
		}

		return total;
	}
}
