package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumberComplementTest {

	private NumberComplement solution;

	@Before
	public void setup() {
		solution = new NumberComplement();
	}

	@Test
	public void testAddDigitsExample() {
		int result = solution.findComplement(5);
		
		System.out.println(Integer.toBinaryString(5));
		System.out.println(Integer.toBinaryString(result));

		Assert.assertEquals(2, result);
	}
}
