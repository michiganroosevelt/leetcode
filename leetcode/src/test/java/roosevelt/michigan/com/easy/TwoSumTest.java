package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TwoSumTest {

	private TwoSum solution;

	@Before
	public void setup() {
		solution = new TwoSum();
	}

	@Test
	public void testTwoSumTest() {
		solution.add(2);
		solution.add(3);
		solution.add(5);
		solution.add(10);

		Assert.assertEquals(true, solution.find(12));
		Assert.assertEquals(false, solution.find(6));
		Assert.assertEquals(true, solution.find(5));
	}
	
	@Test
	public void testTwoSumZero() {
		solution.add(0);
		solution.add(0);

		Assert.assertEquals(true, solution.find(0));

	}
}
