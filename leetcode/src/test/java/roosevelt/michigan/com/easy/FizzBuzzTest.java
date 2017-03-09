package roosevelt.michigan.com.easy;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	private FizzBuzz solution;

	private String fizz = "Fizz";

	private String buzz = "Buzz";

	private String fizzBuzz = "FizzBuzz";

	@Before
	public void setup() {
		solution = new FizzBuzz();
	}

	@Test
	public void testExampleInput() {

		List<String> result = solution.fizzBuzz(15);
		int i = 0;

		Assert.assertEquals(15, result.size());
		Assert.assertEquals("1", result.get(i++));
		Assert.assertEquals("2", result.get(i++));
		Assert.assertEquals(fizz, result.get(i++));
		Assert.assertEquals("4", result.get(i++));
		Assert.assertEquals(buzz, result.get(i++));
		Assert.assertEquals(fizz, result.get(i++));
		Assert.assertEquals("7", result.get(i++));
		Assert.assertEquals("8", result.get(i++));
		Assert.assertEquals(fizz, result.get(i++));
		Assert.assertEquals(buzz, result.get(i++));
		Assert.assertEquals("11", result.get(i++));
		Assert.assertEquals(fizz, result.get(i++));
		Assert.assertEquals("13", result.get(i++));
		Assert.assertEquals("14", result.get(i++));
		Assert.assertEquals(fizzBuzz, result.get(i++));
	}

}
