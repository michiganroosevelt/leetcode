package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumProductofThreeNumbersTest {

	private MaximumProductofThreeNumbers solution;

	@Before
	public void setup() {
		solution = new MaximumProductofThreeNumbers();
	}

	@Test
	public void testMaximumProductofThreeNumbersAllPositive() {
		int result = solution.maximumProduct(new int[] { 1, 2, 3 });

		Assert.assertEquals(6, result);
	}

	@Test
	public void testMaximumProductofThreeNumbersSomeNegative() {
		int result = solution.maximumProduct(new int[] { -10, -20, 1, 10 });

		Assert.assertEquals(2000, result);
	}

	@Test
	public void testMaximumProductofThreeNumbersBig() {
		int result = solution.maximumProduct(new int[] { 722, 634, -504, -379, 163, -613, -842, -578, 750, 951, -158,
				30, -238, -392, -487, -797, -157, -374, 999, -5, -521, -879, -858, 382, 626, 803, -347, 903, -205, 57,
				-342, 186, -736, 17, 83, 726, -960, 343, -984, 937, -758, -122, 577, -595, -544, -559, 903, -183, 192,
				825, 368, -674, 57, -959, 884, 29, -681, -339, 582, 969, -95, -455, -275, 205, -548, 79, 258, 35, 233,
				203, 20, -936, 878, -868, -458, -882, 867, -664, -892, -687, 322, 844, -745, 447, -909, -586, 69, -88,
				88, 445, -553, -666, 130, -640, -918, -7, -420, -368, 250, -786 });

		Assert.assertEquals(943695360, result);
	}

}
