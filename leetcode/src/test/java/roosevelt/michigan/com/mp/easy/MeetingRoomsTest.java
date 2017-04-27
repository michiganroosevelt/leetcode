package roosevelt.michigan.com.mp.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import roosevelt.michigan.com.common.Interval;

public class MeetingRoomsTest {

	private MeetingRooms solution;

	@Before
	public void setup() {
		solution = new MeetingRooms();
	}

	@Test
	public void testMeetingRoomsExample() {
		Interval[] input = new Interval[3];
		input[0] = new Interval(0,30);
		input[1] = new Interval(5,10);
		input[2] = new Interval(15,20);
		
		boolean result = solution.canAttendMeetings(input);

		Assert.assertEquals(false, result);
	}

	@Test
	public void testMeetingRoomsTrue() {
		Interval[] input = new Interval[3];
		input[0] = new Interval(0,10);
		input[2] = new Interval(10,20);
		input[1] = new Interval(30,40);
		
		boolean result = solution.canAttendMeetings(input);

		Assert.assertEquals(true, result);
	}

	@Test
	public void testMeetingRoomsOneInput() {
		Interval[] input = new Interval[1];
		input[0] = new Interval(0,10);
		
		boolean result = solution.canAttendMeetings(input);

		Assert.assertEquals(true, result);
	}
}
