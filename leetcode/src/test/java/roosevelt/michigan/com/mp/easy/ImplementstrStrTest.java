package roosevelt.michigan.com.mp.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ImplementstrStrTest {

	private ImplementstrStr solution;

	@Before
	public void setup() {
		solution = new ImplementstrStr();
	}

	@Test
	public void testImplementstrStr1() {
		int result = solution.strStr("findme", "me");
		
		Assert.assertEquals(4, result);
	}

	@Test
	public void testImplementstrStr2() {
		int result = solution.strStr("findme", "finme");
		
		Assert.assertEquals(-1, result);
	}

	@Test
	public void testImplementstrStr3() {
		int result = solution.strStr("onetwookthree", "ok");
		
		Assert.assertEquals(6, result);
	}

}
