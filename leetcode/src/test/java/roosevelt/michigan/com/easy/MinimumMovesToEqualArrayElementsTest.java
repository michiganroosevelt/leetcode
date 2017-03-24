package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinimumMovesToEqualArrayElementsTest {

	private MinimumMovesToEqualArrayElements solution;

	@Before
	public void setup() {
		solution = new MinimumMovesToEqualArrayElements();
	}

	@Test
	public void testNullRoot() {
		int[] input = new int[] { 1, 2, 3 };

		int result = solution.minMoves(input);

		Assert.assertEquals(3, result);
	}

	@Test
	public void testHugeDifference() {
		int[] input = new int[] { 1,2147483647 };

		int result = solution.minMoves(input);

		Assert.assertEquals(2147483646, result);
	}

}
