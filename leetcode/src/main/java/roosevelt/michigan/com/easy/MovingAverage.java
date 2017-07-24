package roosevelt.michigan.com.easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author soup
 *
 */
public class MovingAverage {

	private int size;

	private Queue<Integer> values = new LinkedList<>();

	public MovingAverage(int size) {
		this.size = size;
	}

	public double next(int val) {
		if (values.size() >= size) {
			values.poll();
			values.add(val);
		} else {
			values.add(val);
		}

		double divisor = values.size();
		double total = 0;
		for (Integer value : values) {
			total += value;
		}

		return total / divisor;
	}

}
