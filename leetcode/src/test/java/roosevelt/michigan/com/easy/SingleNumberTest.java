package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SingleNumberTest {

	private SingleNumber solution;

	/**
	 * create ReverseString object
	 */
	@Before
	public void setup() {
		solution = new SingleNumber();
	}

	/**
	 * Unit test for NimGame for the first example input
	 */
	@Test
	public void testFirstExampleInput() {
		Assert.assertEquals(1, solution.singleNumber(new int[]{1,2,2,3,3,4,4}));
		Assert.assertEquals(2, solution.singleNumber(new int[]{1,2,3,4,1,3,4}));
		Assert.assertEquals(1, solution.singleNumber(new int[]{1}));
	}

}
