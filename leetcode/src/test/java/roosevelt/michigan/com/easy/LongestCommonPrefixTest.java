package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestCommonPrefixTest {

	private LongestCommonPrefix solution;

	@Before
	public void setup() {
		solution = new LongestCommonPrefix();
	}

	@Test
	public void testLongestCommonPrefixNormal() {
		String[] input = new String[3];
		input[0] = "bla";
		input[1] = "blaaa";
		input[2] = "blzz";
		
		String result = solution.longestCommonPrefix(input);

		Assert.assertEquals("bl", result);
	}

	@Test
	public void testLongestCommonPrefixEmpty() {
		String[] input = new String[3];
		input[0] = "";
		input[1] = "blaaa";
		input[2] = "blzz";
		
		String result = solution.longestCommonPrefix(input);

		Assert.assertEquals("", result);
	}

	@Test
	public void testLongestCommonPrefixShort() {
		String[] input = new String[3];
		input[0] = "abc";
		input[1] = "abcd";
		input[2] = "a";
		
		String result = solution.longestCommonPrefix(input);

		Assert.assertEquals("a", result);
	}

	
}
