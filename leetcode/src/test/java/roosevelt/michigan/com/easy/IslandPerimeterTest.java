package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class IslandPerimeterTest {
	
	private IslandPerimeter solution;

	/**
	 * create ReverseString object
	 */
	@Before
	public void setup() {
		solution = new IslandPerimeter();
	}
	
	/**
	 * Unit test for IslandPerimeter for the first example input
	 */
	@Ignore
	@Test
	public void testFirstExampleInput() {
		
		int[][] grid = new int[4][4];
		grid[0] = new int[]{0,1,0,0};
		grid[1] = new int[]{1,1,1,0};
		grid[2] = new int[]{0,1,0,0};
		grid[3] = new int[]{1,1,0,0};
		
		int result = solution.islandPerimeter(grid);

		Assert.assertEquals(16, result);
	}

	/**
	 * Unit test for ReverseString for the first example input
	 */
	@Ignore
	@Test
	public void testInputLengthOne() {
		
		int[][] grid = new int[1][1];
		grid[0] = new int[]{1};
		
		int result = solution.islandPerimeter(grid);

		Assert.assertEquals(4, result);
	}

	/**
	 * Unit test for ReverseString for the first example input
	 */
	@Ignore
	@Test
	public void testHeightOneLengthTwo() {
		
		int[][] grid = new int[1][1];
		grid[0] = new int[]{1,2};
		
		int result = solution.islandPerimeter(grid);

		Assert.assertEquals(4, result);
	}

}
