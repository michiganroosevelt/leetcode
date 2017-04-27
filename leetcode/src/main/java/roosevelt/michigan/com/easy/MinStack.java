package roosevelt.michigan.com.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * Design a stack that supports push, pop, top, and retrieving the minimum
 * element in constant time.
 * 
 * push(x) -- Push element x onto stack. pop() -- Removes the element on top of
 * the stack. top() -- Get the top element. getMin() -- Retrieve the minimum
 * element in the stack.
 * 
 * Example:
 * 
 * MinStack minStack = new MinStack(); minStack.push(-2); minStack.push(0);
 * minStack.push(-3); minStack.getMin(); --> Returns -3. minStack.pop();
 * minStack.top(); --> Returns 0. minStack.getMin(); --> Returns -2.
 * 
 * 
 * @author soup
 *
 */
public class MinStack {

	List<Integer> stack;
	int min = Integer.MAX_VALUE;

	/** initialize your data structure here. */
	public MinStack() {
		stack = new LinkedList<>();
	}

	public void push(int x) {
		if (x < min) {
			min = x;
		}
		stack.add(x);
	}

	public void pop() {
		stack.remove(stack.size() - 1);
		min = Integer.MAX_VALUE;
		for (int i = 0; i < stack.size(); i++) {
			if (stack.get(i) < min) {
				min = stack.get(i);
			}
		}
	}

	public int top() {
		return stack.get(stack.size() - 1);
	}

	public int getMin() {
		return min;
	}
}
