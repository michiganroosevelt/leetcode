package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExcelSheetColumnNumberTest {

	private ExcelSheetColumnNumber solution;

	@Before
	public void setup() {
		solution = new ExcelSheetColumnNumber();
	}

	@Test
	public void testAddDigitsExample() {
		int result = solution.titleToNumber("AA");

		Assert.assertEquals(27, result);
	}

	@Test
	public void testAddDigitsSingleA() {
		int result = solution.titleToNumber("A");

		Assert.assertEquals(1, result);
	}

	@Test
	public void testAddDigitsSingleAB() {
		int result = solution.titleToNumber("AB");

		Assert.assertEquals(28, result);
	}

	@Test
	public void testAddDigitsSingleBA() {
		int result = solution.titleToNumber("BA");

		Assert.assertEquals(53, result);
	}

	@Test
	public void testAddDigitsSingleAAA() {
		int result = solution.titleToNumber("AAA");

		Assert.assertEquals(703, result);
	}
}
