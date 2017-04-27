package roosevelt.michigan.com.mp.easy;

import java.util.Arrays;
import java.util.Comparator;

import roosevelt.michigan.com.common.Interval;

/**
 * Given an array of meeting time intervals consisting of start and end times
 * [[s1,e1],[s2,e2],...] (si < ei), determine if a person could attend all
 * meetings.
 * 
 * For example, Given [[0, 30],[5, 10],[15, 20]], return false.
 * 
 * @author soup
 *
 */
public class MeetingRooms {

	public boolean canAttendMeetings(Interval[] intervals) {
		if( intervals == null || intervals.length <= 1 ) {
			return true;
		}
		
		Arrays.sort(intervals, new Comparator<Interval>(){
			@Override
			public int compare(Interval interval1, Interval interval2) {
				return interval1.start - interval2.start;
			}
		});
		
		Interval previous = intervals[0];
		for( int i = 1; i < intervals.length; i++ ) {
			Interval current = intervals[i];
			if( previous.end > current.start ) {
				return false;
			}
			previous = current;
		}
		

		return true;
	}
}
