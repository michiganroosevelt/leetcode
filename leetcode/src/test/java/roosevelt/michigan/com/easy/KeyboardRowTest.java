package roosevelt.michigan.com.easy;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class KeyboardRowTest {

	private KeyboardRow solution;

	@Before
	public void setup() {
		solution = new KeyboardRow();
	}

	@Test
	public void testExampleInput() {
		String[] input = new String[] { "Hello", "Alaska", "Dad", "Peace" };

		String[] result = solution.findWords(input);

		Assert.assertEquals(2, result.length);
		Assert.assertEquals("Alaska", result[0]);
		Assert.assertEquals("Dad", result[1]);
	}

	@Test
	public void testUpperRow() {
		String input1 = "uirwquoruWQRWEurweiwreuo";
		String input2 = "oiefjoifiijw";
		String input3 = "njniuniuiuivuju";
		String input4 = "iuwreouirweoiurwqqerqrweuioqwr";

		String[] input = new String[] { input1, input2, input3, input4 };

		String[] result = solution.findWords(input);

		Assert.assertEquals(2, result.length);
		Assert.assertEquals(input1, result[0]);
		Assert.assertEquals(input4, result[1]);
	}

	@Test
	public void testMiddleRow() {
		String input1 = "uirwquoruWQRWEurweiwreuo";
		String input2 = "oiefjoifiijw";
		String input3 = "njniuniuiuivuju";
		String input4 = "iuwreouirweoiurwqqerqrweuioqwr";

		String[] input = new String[] { input1, input2, input3, input4 };

		String[] result = solution.findWords(input);

		Assert.assertEquals(2, result.length);
		Assert.assertEquals(input1, result[0]);
		Assert.assertEquals(input4, result[1]);
	}

	@Test
	public void testLowerRow() {
		String input1 = "ghjkhjdfdfsajfdjJHGFfjhgjhgf";
		String input2 = "oiefjoifiijw";
		String input3 = "njniuniuiuivuju";
		String input4 = "lkjhljhjhgfhgfdfsaGFHJKLGHJK";

		String[] input = new String[] { input1, input2, input3, input4 };

		String[] result = solution.findWords(input);

		Assert.assertEquals(2, result.length);
		Assert.assertEquals(input1, result[0]);
		Assert.assertEquals(input4, result[1]);
	}

	@Test
	public void testEmptyInput() {
		String[] input = new String[2];

		String[] result = solution.findWords(input);

		Assert.assertEquals(0, result.length);
	}

	@Test
	public void testNullInput() {
		String[] result = solution.findWords(null);

		Assert.assertEquals(0, result.length);
	}

}
