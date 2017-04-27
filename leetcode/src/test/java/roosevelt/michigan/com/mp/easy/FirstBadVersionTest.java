package roosevelt.michigan.com.mp.easy;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FirstBadVersionTest {

	private FirstBadVersion solution;

	@Before
	public void setup() {
		solution = new FirstBadVersion();
		Map<Integer, Boolean> badVersions = new HashMap<>();
		badVersions.put(1, true);
		badVersions.put(2, true);
		badVersions.put(3, true);
		badVersions.put(4, true);
		badVersions.put(6, true);
		badVersions.put(7, true);
		badVersions.put(8, true);
		badVersions.put(9, true);
		badVersions.put(10, true);
		solution.setBadVersions(badVersions);
	}

	@Test
	public void testAddDigitsExampleOneIsGood() {
		Map<Integer, Boolean> badVersions = new HashMap<>();
		badVersions.put(2, true);
		solution.setBadVersions(badVersions);
		int result = solution.firstBadVersion(2);

		Assert.assertEquals(2, result);
	}

	@Test
	public void testAddDigitsExample() {
		int result = solution.firstBadVersion(10);

		Assert.assertEquals(6, result);
	}

	@Test
	public void testAddDigitsExampleFirst() {
		int result = solution.firstBadVersion(3);

		Assert.assertEquals(1, result);
	}

	@Test
	public void testAddDigitsExampleVersion2() {
		int result = solution.firstBadVersion(2);

		Assert.assertEquals(1, result);
	}
}
