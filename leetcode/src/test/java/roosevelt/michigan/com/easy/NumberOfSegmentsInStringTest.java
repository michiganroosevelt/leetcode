package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumberOfSegmentsInStringTest {

	private NumberOfSegmentsInString solution;

	@Before
	public void setup() {
		solution = new NumberOfSegmentsInString();
	}

	@Test
	public void testAddDigitsExample() {
		int result = solution.countSegments("Hello,     my name is John");

		Assert.assertEquals(5, result);
	}
}
