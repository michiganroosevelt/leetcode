package roosevelt.michigan.com.misc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTest {

	private BinarySearch solution;

	@Before
	public void setup() {
		solution = new BinarySearch();
	}

	@Test
	public void testBinarySearch35() {
		int input = 35;
		int result = solution.findNumber(input);

		Assert.assertEquals(input, result);
	}

	@Test
	public void testBinarySearch66() {
		int input = 66;
		int result = solution.findNumber(input);

		Assert.assertEquals(input, result);
	}
}
