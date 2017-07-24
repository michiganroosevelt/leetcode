package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConvertNumberToHexadecimalTest {

	private ConvertNumberToHexadecimal solution;

	@Before
	public void setup() {
		solution = new ConvertNumberToHexadecimal();
	}

	@Test
	public void testAddDigitsExample() {
		String result = solution.toHex(26);

		Assert.assertEquals("1a", result);
	}
}
