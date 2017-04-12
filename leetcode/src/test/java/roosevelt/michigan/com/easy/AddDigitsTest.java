package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddDigitsTest {
	
	private AddDigits solution;

	@Before
	public void setup() {
		solution = new AddDigits();
	}

	@Test
	public void testAddDigitsExample() {
		int result = solution.addDigits(38);

		Assert.assertEquals(2, result);
	}

}
