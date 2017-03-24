package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RelativeRanksTest {

	private RelativeRanks solution;

	@Before
	public void setup() {
		solution = new RelativeRanks();
	}

	@Test
	public void testSortedInput() {
		int[] input = new int[]{5,4,3,2,1};
		
		String[] result = solution.findRelativeRanks(input);

		Assert.assertEquals(RelativeRanks.GOLD, result[0]);
		Assert.assertEquals(RelativeRanks.SILVER, result[1]);
		Assert.assertEquals(RelativeRanks.BRONZE, result[2]);
		Assert.assertEquals("4", result[3]);
		Assert.assertEquals("5", result[4]);
	}

	@Test
	public void testNonSortedInput() {
		int[] input = new int[]{1,4,2,3,5};
		
		String[] result = solution.findRelativeRanks(input);

		Assert.assertEquals("5", result[0]);
		Assert.assertEquals(RelativeRanks.SILVER, result[1]);
		Assert.assertEquals("4", result[2]);
		Assert.assertEquals(RelativeRanks.BRONZE, result[3]);
		Assert.assertEquals(RelativeRanks.GOLD, result[4]);
	}

}
