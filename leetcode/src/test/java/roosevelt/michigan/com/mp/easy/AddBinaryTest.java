package roosevelt.michigan.com.mp.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddBinaryTest {

	private AddBinary solution;

	@Before
	public void setup() {
		solution = new AddBinary();
	}

	@Test
	public void testAddBinaryExample() {
		String result = solution.addBinary("11", "1");
		Assert.assertEquals("100", result);
	}

	@Test
	public void testAddDigitsExample() {
		String a = Integer.toBinaryString(4);
		String b = Integer.toBinaryString(10);
		
		String result = solution.addBinary(a, b);
		Assert.assertEquals(Integer.toBinaryString(14), result);
	}
}
