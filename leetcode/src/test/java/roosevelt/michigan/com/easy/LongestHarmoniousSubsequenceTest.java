
package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestHarmoniousSubsequenceTest {

	private LongestHarmoniousSubsequence solution;

	@Before
	public void setup() {
		solution = new LongestHarmoniousSubsequence();
	}

//	@Test
	public void testLongestHarmoniousSubsequenceSeven() {
		int result = solution.findLHS(new int[] { 1, 2, 2, 3, 4, 5, 1, 1, 1, 1 });

		Assert.assertEquals(7, result);
	}

//	@Test
	public void testLongestHarmoniousSubsequenceExample() {
		int result = solution.findLHS(new int[] { 1, 3, 2, 2, 5, 2, 3, 7 });

		Assert.assertEquals(5, result);
	}

	@Test
	public void testLongestHarmoniousSubsequenceFour() {
		int result = solution.findLHS(new int[] { 1, 2, 3, 4 });

		Assert.assertEquals(2, result);
	}
}
