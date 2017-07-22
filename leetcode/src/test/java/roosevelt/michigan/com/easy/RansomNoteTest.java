package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RansomNoteTest {

	private RansomNote solution;

	@Before
	public void setup() {
		solution = new RansomNote();
	}

	@Test
	public void testRansomNoteExample() {
		String note = "aab";
		String magazine = "aabb";
		
		boolean result = solution.canConstruct(note, magazine);

		Assert.assertEquals(true, result);
	}

	@Test
	public void testRansomNoteTooManyBs() {
		String note = "aabbb";
		String magazine = "aabb";
		
		boolean result = solution.canConstruct(note, magazine);

		Assert.assertEquals(false, result);
	}
}
