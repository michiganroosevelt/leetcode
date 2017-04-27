package roosevelt.michigan.com.medium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SingleNumberIIITest {

	private SingleNumberIII solution;

	@Before
	public void setup() {
		solution = new SingleNumberIII();
	}

	@Test
	public void testAddDigitsExample() {
		int[] input = new int[]{1, 2, 1, 3, 2, 5};
		int[] result = solution.singleNumber(input);

		Assert.assertEquals(3, result[0]);
		Assert.assertEquals(5, result[1]);
	}
}
