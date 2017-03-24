package roosevelt.michigan.com.medium;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindAllDuplicatesInAnArrayTest {

	private FindAllDuplicatesInAnArray solution;

	@Before
	public void setup() {
		solution = new FindAllDuplicatesInAnArray();
	}

	@Test
	public void testWithDuplicate() {
		int[] input = new int[] { 4, 3, 2, 7, 8, 2, 3, 1 };

		List<Integer> result = solution.findDuplicates(input);

		Assert.assertEquals(2, result.size());
		Assert.assertEquals(2, result.get(0).intValue());
		Assert.assertEquals(3, result.get(1).intValue());
	}

}
