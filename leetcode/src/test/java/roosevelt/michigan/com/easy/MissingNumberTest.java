package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MissingNumberTest {

	private MissingNumber solution;

	@Before
	public void setup() {
		solution = new MissingNumber();
	}

	@Test
	public void testAddDigitsExample() {
		int[] input = new int[]{0,1,3};
		int result = solution.missingNumber(input);

		Assert.assertEquals(2, result);
	}
}
