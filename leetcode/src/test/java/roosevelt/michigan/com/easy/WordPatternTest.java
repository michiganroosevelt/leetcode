package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WordPatternTest {

	private WordPattern solution;

	@Before
	public void setup() {
		solution = new WordPattern();
	}

	@Test
	public void testWordPatternDuplicateWordLookUp() {
		boolean result = solution.wordPattern("aab","dog dog dog");

		Assert.assertEquals(false, result);
	}

	@Test
	public void testWordPatternSuccess() {
		boolean result = solution.wordPattern("abba","dog cat cat dog");

		Assert.assertEquals(true, result);
	}

	@Test
	public void testWordPatternSimpleSuccess() {
		boolean result = solution.wordPattern("aaaa","dog dog dog dog");

		Assert.assertEquals(true, result);
	}

	@Test
	public void testWordPatternSimpleFailure() {
		boolean result = solution.wordPattern("aaaa","dog dog dog cat");

		Assert.assertEquals(false, result);
	}

	@Test
	public void testWordPatternSizeFailure() {
		boolean result = solution.wordPattern("a","dog dog dog dog");

		Assert.assertEquals(false, result);
	}
}
