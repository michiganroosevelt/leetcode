package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ThirdMaximumNumberTest {

	private ThirdMaximumNumber solution;

	@Before
	public void setup() {
		solution = new ThirdMaximumNumber();
	}

	@Test
	public void testThirdMaximumNumberExample1() {
		int[] input = new int[]{3, 2, 1};
		int result = solution.thirdMax(input);

		Assert.assertEquals(1, result);
	}

	@Test
	public void testThirdMaximumNumberExample2() {
		int[] input = new int[]{2, 1};
		int result = solution.thirdMax(input);

		Assert.assertEquals(2, result);
	}

	@Test
	public void testThirdMaximumNumberExample3() {
		int[] input = new int[]{2, 2, 3, 1};
		int result = solution.thirdMax(input);

		Assert.assertEquals(1, result);
	}

	@Test
	public void testThirdMaximumNumberLowestThird() {
		int[] input = new int[]{3,2,Integer.MIN_VALUE};
		int result = solution.thirdMax(input);

		Assert.assertEquals(Integer.MIN_VALUE, result);
	}
}
