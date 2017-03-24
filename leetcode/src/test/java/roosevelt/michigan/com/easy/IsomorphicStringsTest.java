package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IsomorphicStringsTest {

	private IsomorphicStrings solution;

	@Before
	public void setup() {
		solution = new IsomorphicStrings();
	}

	@Test
	public void testValidIsomorphicStrings() {
		boolean result = solution.isIsomorphic("egg", "add");

		Assert.assertEquals(true, result);
	}

	@Test
	public void testLongValidIsomorphicStrings() {
		boolean result = solution.isIsomorphic("paper", "title");

		Assert.assertEquals(true, result);
	}

	@Test
	public void testInvalidIsomorphicStrings() {
		boolean result = solution.isIsomorphic("foo", "bar");

		Assert.assertEquals(false, result);
	}

	@Test
	public void testInvalidSimpleIsomorphicStrings() {
		boolean result = solution.isIsomorphic("ab", "aa");

		Assert.assertEquals(false, result);
	}

}
