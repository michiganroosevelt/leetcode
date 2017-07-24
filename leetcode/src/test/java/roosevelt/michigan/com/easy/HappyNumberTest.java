package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HappyNumberTest {

	private HappyNumber solution;

	@Before
	public void setup() {
		solution = new HappyNumber();
	}

	@Test
	public void testHappyNumberTest() {
		boolean result = solution.isHappy(82);

		Assert.assertEquals(true, result);
	}
}
