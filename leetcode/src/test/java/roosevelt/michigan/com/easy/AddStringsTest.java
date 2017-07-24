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
	public void testAddStrings198() {
		String result = solution.addStrings("99", "99");

		Assert.assertEquals("198", result);
	}

	@Test
	public void testAddStrings108() {
		String result = solution.addStrings("99", "9");

		Assert.assertEquals("108", result);
	}

	@Test
	public void testAddStrings108Again() {
		String result = solution.addStrings("9", "99");

		Assert.assertEquals("108", result);
	}

	@Test
	public void testAddStrings110() {
		String result = solution.addStrings("100", "10");

		Assert.assertEquals("110", result);
	}

	@Test
	public void testAddStrings1049() {
		String result = solution.addStrings("950", "99");

		Assert.assertEquals("1049", result);
	}

	@Test
	public void testAddStrings2049() {
		String result = solution.addStrings("1950", "99");

		Assert.assertEquals("2049", result);
	}
}
