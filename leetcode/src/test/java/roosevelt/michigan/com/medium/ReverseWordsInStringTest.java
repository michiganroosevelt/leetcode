package roosevelt.michigan.com.medium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseWordsInStringTest {

	private ReverseWordsInString solution;

	@Before
	public void setup() {
		solution = new ReverseWordsInString();
	}

	@Test
	public void testAddDigitsExample() {
		String result = solution.reverseWords("the sky is blue");

		Assert.assertEquals("blue is sky the", result);
	}
}
