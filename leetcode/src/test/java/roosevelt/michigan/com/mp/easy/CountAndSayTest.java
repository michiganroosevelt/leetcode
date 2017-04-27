package roosevelt.michigan.com.mp.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CountAndSayTest {

	private CountAndSay solution;

	@Before
	public void setup() {
		solution = new CountAndSay();
	}

	@Test
	public void testCountAndSayExample1() {
		String result = solution.countAndSay(1);

		Assert.assertEquals("1", result);
	}

	@Test
	public void testCountAndSayExample2() {
		String result = solution.countAndSay(2);

		Assert.assertEquals("11", result);
	}

	@Test
	public void testCountAndSayExample3() {
		String result = solution.countAndSay(3);

		Assert.assertEquals("21", result);
	}

	@Test
	public void testCountAndSayExample4() {
		String result = solution.countAndSay(4);

		Assert.assertEquals("1211", result);
	}

	@Test
	public void testCountAndSayExample5() {
		String result = solution.countAndSay(5);

		Assert.assertEquals("111221", result);
	}
}
