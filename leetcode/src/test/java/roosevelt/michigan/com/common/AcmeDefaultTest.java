package roosevelt.michigan.com.common;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AcmeDefaultTest {

	private AcmeDefault solution;

	@Before
	public void setup() {
		solution = new AcmeDefault();
	}

	@Test
	public void testAddDigitsExample() {
		String result = solution.defaultMethod();

		Assert.assertEquals(null, result);
	}
}
