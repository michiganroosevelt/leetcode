package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoveZeroesTest {

	private MoveZeroes solution;

	@Before
	public void setup() {
		solution = new MoveZeroes();
	}

	@Test
	public void testMoveZeroesExample() {
		int[] input = new int[]{0, 1, 0, 3, 12};
		solution.moveZeroes(input);

		Assert.assertEquals(1, input[0]);
		Assert.assertEquals(3, input[1]);
		Assert.assertEquals(12, input[2]);
		Assert.assertEquals(0, input[3]);
		Assert.assertEquals(0, input[4]);
	}

	@Test
	public void testMoveZeroesConsecutiveZeros() {
		int[] input = new int[]{0, 1, 0, 0, 12};
		solution.moveZeroes(input);

		Assert.assertEquals(1, input[0]);
		Assert.assertEquals(12, input[1]);
		Assert.assertEquals(0, input[2]);
		Assert.assertEquals(0, input[3]);
		Assert.assertEquals(0, input[4]);
	}

	@Test
	public void testMoveZeroesNoZeros() {
		int[] input = new int[]{2, 1};
		solution.moveZeroes(input);

		Assert.assertEquals(2, input[0]);
		Assert.assertEquals(1, input[1]);
	}

}
