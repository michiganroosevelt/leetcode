package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TwoSumIIInputArrayIsSortedTest {

	private TwoSumIIInputArrayIsSorted solution;

	@Before
	public void setup() {
		solution = new TwoSumIIInputArrayIsSorted();
	}

	@Test
	public void testNullRoot() {
		int[] input = new int[]{2, 7, 11, 15};
		
		int[] result = solution.twoSum(input, 9);

		Assert.assertEquals(1, result[0]);
		Assert.assertEquals(2, result[1]);
	}

}
