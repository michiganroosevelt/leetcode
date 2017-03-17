package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NimGameTest {

	private NimGame solution;

	/**
	 * create ReverseString object
	 */
	@Before
	public void setup() {
		solution = new NimGame();
	}

	/**
	 * Unit test for NimGame for the first example input
	 */
	@Test
	public void testFirstExampleInput() {
		Assert.assertEquals(true, solution.canWinNim(1));
		Assert.assertEquals(true, solution.canWinNim(2));
		Assert.assertEquals(true, solution.canWinNim(3));
		Assert.assertEquals(false, solution.canWinNim(4));

		Assert.assertEquals(true, solution.canWinNim(5));
		Assert.assertEquals(true, solution.canWinNim(6));
		Assert.assertEquals(true, solution.canWinNim(7));
		Assert.assertEquals(false, solution.canWinNim(8));
		
		Assert.assertEquals(true, solution.canWinNim(9));
		Assert.assertEquals(true, solution.canWinNim(10));
		Assert.assertEquals(true, solution.canWinNim(11));
		Assert.assertEquals(false, solution.canWinNim(12));

		Assert.assertEquals(true, solution.canWinNim(13));
		Assert.assertEquals(true, solution.canWinNim(14));
		Assert.assertEquals(true, solution.canWinNim(15));
		Assert.assertEquals(false, solution.canWinNim(16));
	}

}
