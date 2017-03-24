package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ContainsDuplicateTest {

	private ContainsDuplicate solution;

	@Before
	public void setup() {
		solution = new ContainsDuplicate();
	}

	@Test
	public void testWithoutDuplicate() {
		int[] input = new int[] { 1, 2, 3 };

		boolean result = solution.containsDuplicate(input);

		Assert.assertEquals(false, result);
	}

	@Test
	public void testWithDuplicate() {
		int[] input = new int[] { 1, 2, 3, 2 };

		boolean result = solution.containsDuplicate(input);

		Assert.assertEquals(true, result);
	}

}
