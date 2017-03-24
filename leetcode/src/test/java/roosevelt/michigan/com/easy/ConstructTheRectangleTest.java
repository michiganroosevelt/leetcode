package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConstructTheRectangleTest {

	private ConstructTheRectangle solution;

	@Before
	public void setup() {
		solution = new ConstructTheRectangle();
	}

	@Test
	public void testConstructTheRectangleExample() {
		int[] result = solution.constructRectangle(4);

		Assert.assertEquals(2, result[0]);
		Assert.assertEquals(2, result[1]);
	}

	@Test
	public void testConstructTheRectangleSquareRoot() {
		int[] result = solution.constructRectangle(9);

		Assert.assertEquals(3, result[0]);
		Assert.assertEquals(3, result[1]);
	}


	@Test
	public void testConstructTheRectangleOddNumber() {
		int[] result = solution.constructRectangle(5);

		Assert.assertEquals(5, result[0]);
		Assert.assertEquals(1, result[1]);
	}

	@Test
	public void testConstructTheRectangleEight() {
		int[] result = solution.constructRectangle(8);

		Assert.assertEquals(4, result[0]);
		Assert.assertEquals(2, result[1]);
	}

}
