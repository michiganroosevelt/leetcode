package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MovingAverageTest {

	private MovingAverage solution;

	@Before
	public void setup() {
		solution = new MovingAverage(3);
	}

	@Test
	public void testAddDigitsExample() {
		double result = 0;

		result = solution.next(10);
		Assert.assertEquals(10, result, 0);

		result = solution.next(20);
		Assert.assertEquals(15, result, 0);

		result = solution.next(30);
		Assert.assertEquals(20, result, 0);

		result = solution.next(40);
		Assert.assertEquals(30, result, 0);
	}
}
