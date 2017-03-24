package roosevelt.michigan.com.easy;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumbersDisappearedInAnArrayTest {
	
	private NumbersDisappearedInAnArray solution;

	/**
	 * create ReverseString object
	 */
	@Before
	public void setup() {
		solution = new NumbersDisappearedInAnArray();
	}

	/**
	 * Unit test for NimGame for the first example input
	 */
	@Test
	public void testFirstExampleInput() {
		
		int[] input = new int[]{4,3,2,7,8,2,3,1};
		
		List<Integer> result = solution.findDisappearedNumbers(input);
		
		Assert.assertEquals(2, result.size());
	}

}
