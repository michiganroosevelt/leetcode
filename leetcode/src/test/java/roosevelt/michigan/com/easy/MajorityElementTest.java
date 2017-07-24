package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MajorityElementTest {

	private MajorityElement solution;

	@Before
	public void setup() {
		solution = new MajorityElement();
	}

	@Test
	public void testAddDigitsExample() {
		int result = solution.majorityElement(new int[]{1,2,2,4,5,2,2,2});

		Assert.assertEquals(2, result);
	}
}
