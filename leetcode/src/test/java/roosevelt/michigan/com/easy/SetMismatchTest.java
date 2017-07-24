package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SetMismatchTest {

	private SetMismatch solution;

	@Before
	public void setup() {
		solution = new SetMismatch();
	}

	@Test
	public void testSetMismatch31() {
		int[] result = solution.findErrorNums(new int[] { 3, 2, 3, 4, 6, 5 });

		Assert.assertEquals(3, result[0]);
		Assert.assertEquals(1, result[1]);
	}


	@Test
	public void testSetMismatch23() {
		int[] result = solution.findErrorNums(new int[] { 1, 2, 2, 4 });

		Assert.assertEquals(2, result[0]);
		Assert.assertEquals(3, result[1]);
	}

	@Test
	public void testSetMismatch210() {
		int[] result = solution.findErrorNums(new int[] { 1,5,3,2,2,7,6,4,8,9 });

		Assert.assertEquals(2, result[0]);
		Assert.assertEquals(10, result[1]);
	}
}
