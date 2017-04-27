package roosevelt.michigan.com.mp.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BestTimetoBuyandSellStockTest {

	private BestTimetoBuyandSellStock solution;

	@Before
	public void setup() {
		solution = new BestTimetoBuyandSellStock();
	}

	@Test
	public void testAddDigitsExample() {
		int[] input = new int[]{7, 1, 5, 3, 6, 4};
		int result = solution.maxProfit(input);

		Assert.assertEquals(5, result);
	}

	@Test
	public void testAddDigitsExample2() {
		int[] input = new int[]{7, 6, 4, 3, 1};
		int result = solution.maxProfit(input);

		Assert.assertEquals(0, result);
	}

	@Test
	public void testAddDigitsExample3() {
		int[] input = new int[]{1,2,3,4};
		int result = solution.maxProfit(input);

		Assert.assertEquals(3, result);
	}

	@Test
	public void testAddDigitsExample4() {
		int[] input = new int[]{4,3,2,1};
		int result = solution.maxProfit(input);

		Assert.assertEquals(0, result);
	}

	@Test
	public void testAddDigitsExample5() {
		int[] input = new int[]{4,10,25,2,10};
		int result = solution.maxProfit(input);

		Assert.assertEquals(21, result);
	}

}
