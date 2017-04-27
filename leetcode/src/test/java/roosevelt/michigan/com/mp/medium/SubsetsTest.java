package roosevelt.michigan.com.mp.medium;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SubsetsTest {

	private Subsets solution;

	@Before
	public void setup() {
		solution = new Subsets();
	}

	@Test
	public void testSubsetsExample() {
		int[] input = new int[]{1,2,3};
		List<List<Integer>> result = solution.subsets(input);

		Assert.assertEquals(8, result.size());
	}

	@Test
	public void testSubsets4() {
		int[] input = new int[]{1,2,3,4};
		List<List<Integer>> result = solution.subsets(input);

		Assert.assertEquals(15, result.size());
	}
}
