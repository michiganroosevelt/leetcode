package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrangingCoinsTest {

	private ArrangingCoins solution;

	@Before
	public void setup() {
		solution = new ArrangingCoins();
	}

	@Test
	public void testArrangingCoinsExample() {
		int result = solution.arrangeCoins(5);

		Assert.assertEquals(2, result);
	}

	@Test
	public void testArrangingCoinsEight() {
		int result = solution.arrangeCoins(8);

		Assert.assertEquals(3, result);
	}
}
