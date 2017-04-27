package roosevelt.michigan.com.mp.medium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import roosevelt.michigan.com.common.Interval;

public class MeetingRoomsIITest {

	private MeetingRoomsII solution;

	@Before
	public void setup() {
		solution = new MeetingRoomsII();
	}

	@Test
	public void testAddDigitsExample() {
		Interval[] intervals = new Interval[3];
		intervals[0] = new Interval(5,12);
		intervals[1] = new Interval(1,10);
		intervals[2] = new Interval(2,15);
		
		int result = solution.minMeetingRooms(intervals);

		Assert.assertEquals(3, result);
	}

	@Test
	public void testAddDigitsNeed2() {
		Interval[] intervals = new Interval[3];
		intervals[0] = new Interval(1,10);
		intervals[1] = new Interval(5,20);
		intervals[2] = new Interval(15,30);
		
		int result = solution.minMeetingRooms(intervals);

		Assert.assertEquals(2, result);
	}

	@Test
	public void testAddDigitsNeed2Duplicate() {
		Interval[] intervals = new Interval[3];
		intervals[0] = new Interval(1,5);
		intervals[1] = new Interval(8,9);
		intervals[2] = new Interval(8,9);
		
		int result = solution.minMeetingRooms(intervals);

		Assert.assertEquals(2, result);
	}

	@Test
	public void testAddDigitsNeed3EdgeCase() {
		Interval[] intervals = new Interval[5];
		intervals[0] = new Interval(2,36);
		intervals[1] = new Interval(3,4);
		intervals[2] = new Interval(13,34);
		intervals[3] = new Interval(16,20);
		intervals[4] = new Interval(39,46);
		
		int result = solution.minMeetingRooms(intervals);

		Assert.assertEquals(3, result);
	}

	@Test
	public void testAddDigitsNeed1() {
		Interval[] intervals = new Interval[2];
		intervals[0] = new Interval(7, 10);
		intervals[1] = new Interval(2, 4);
		
		int result = solution.minMeetingRooms(intervals);

		Assert.assertEquals(1, result);
	}
}
