package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HammingDistanceTest {

	private HammingDistance solution;

	@Before
	public void setup() {
		solution = new HammingDistance();
	}

	@Test
	public void testHammingDistanceExample() {
		int result = solution.hammingDistance(1, 4);

		Assert.assertEquals(2, result);
	}

	@Test
	public void testHammingDistanceAnotherExample() {
		int result = solution.hammingDistance(3, 1);

		Assert.assertEquals(1, result);
	}

}
