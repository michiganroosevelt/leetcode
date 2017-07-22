package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseWordsInAStringIIITest {

	private ReverseWordsInAStringIII solution;

	@Before
	public void setup() {
		solution = new ReverseWordsInAStringIII();
	}

	@Test
	public void testAddDigitsExample() {
		String input = "one two three four";
		
		String result = solution.reverseWords(input);

		Assert.assertEquals("eno owt eerht ruof", result);
	}
}
