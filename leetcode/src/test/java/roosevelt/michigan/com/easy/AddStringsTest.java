package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddStringsTest {

	private AddStrings solution;

	@Before
	public void setup() {
		solution = new AddStrings();
	}

	@Test
	public void testAddDigitsExample() {
		String result = solution.addStrings("99", "99");

		Assert.assertEquals("198", result);
	}
}
