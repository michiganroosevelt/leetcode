package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RemoveElementTest {

	private RemoveElement solution;

	@Before
	public void setup() {
		solution = new RemoveElement();
	}

	@Test
	public void testRemoveElementEndIsVal() {
		int[] input = new int[]{3,2,2,3};
		int result = solution.removeElement(input, 3);

		Assert.assertEquals(2, result);
		Assert.assertEquals(2, input[0]);
		Assert.assertEquals(2, input[1]);
	}

	@Test
	public void testRemoveElementEndIsNotVal() {
		int[] input = new int[]{3,2,1,3,5,6};
		int result = solution.removeElement(input, 3);

		Assert.assertEquals(4, result);
		Assert.assertEquals(2, input[0]);
		Assert.assertEquals(1, input[1]);
		Assert.assertEquals(5, input[2]);
		Assert.assertEquals(6, input[3]);
	}
}
