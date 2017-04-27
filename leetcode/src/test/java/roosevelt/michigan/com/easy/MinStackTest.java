package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinStackTest {

	private MinStack solution;

	@Before
	public void setup() {
		solution = new MinStack();
	}

	@Test
	public void testAddDigitsExample() {
		MinStack minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		Assert.assertEquals(-3, minStack.getMin());
		minStack.pop();
		Assert.assertEquals(0,minStack.top());
		Assert.assertEquals(-2,minStack.getMin());
	}
	
	
	
}
