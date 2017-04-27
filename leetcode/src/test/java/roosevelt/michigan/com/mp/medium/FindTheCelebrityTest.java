package roosevelt.michigan.com.mp.medium;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindTheCelebrityTest {

	private FindTheCelebrity solution;

	@Before
	public void setup() {
		solution = new FindTheCelebrity();
	}

	@Test
	public void testAddDigitsExample() {
		Map<Integer, int[]> knows = new HashMap<>();
		knows.put(0, new int[]{1,2,3,4});
		knows.put(1, new int[]{3,4});
		knows.put(2, new int[]{3,4});
		knows.put(4, new int[]{3,1});
		
		solution.relationshipMap = knows;

		int result = solution.findCelebrity(5);

		Assert.assertEquals(2, result);
	}
}
