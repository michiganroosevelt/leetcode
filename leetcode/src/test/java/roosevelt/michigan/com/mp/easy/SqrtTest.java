package roosevelt.michigan.com.mp.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SqrtTest {

	private Sqrt solution;

	@Before
	public void setup() {
		solution = new Sqrt();
	}
	
	@Test
	public void testSqrtTest584844() {
		int result = solution.mySqrt(584844);

		Assert.assertEquals(764, result);
	}

	@Test
	public void testSqrtTest2147395599() {
		int result = solution.mySqrt(2147395599);

		Assert.assertEquals(46339, result);
	}

	@Test
	public void testSqrtTest2147395600() {
		int result = solution.mySqrt(2147395600);

		Assert.assertEquals(46340, result);
	}


	@Test
	public void testSqrtTest1() {
		int result = solution.mySqrt(1);

		Assert.assertEquals(1, result);
	}

	@Test
	public void testSqrtTest2() {
		int result = solution.mySqrt(2);

		Assert.assertEquals(1, result);
	}

	@Test
	public void testSqrtTest4() {
		int result = solution.mySqrt(4);

		Assert.assertEquals(2, result);
	}

	@Test
	public void testSqrtTest6() {
		int result = solution.mySqrt(6);

		Assert.assertEquals(2, result);
	}

	@Test
	public void testSqrtTest9() {
		int result = solution.mySqrt(9);

		Assert.assertEquals(3, result);
	}

	@Test
	public void testSqrtTest16() {
		int result = solution.mySqrt(16);

		Assert.assertEquals(4, result);
	}

	@Test
	public void testSqrtTest25() {
		int result = solution.mySqrt(25);

		Assert.assertEquals(5, result);
	}


	
}
