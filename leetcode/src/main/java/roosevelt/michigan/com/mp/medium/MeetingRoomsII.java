package roosevelt.michigan.com.mp.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import roosevelt.michigan.com.common.Interval;

/**
 * 
 * Given an array of meeting time intervals consisting of start and end times
 * [[s1,e1],[s2,e2],...] (si < ei), find the minimum number of conference rooms
 * required.
 * 
 * For example, Given [[0, 30],[5, 10],[15, 20]], return 2.
 * 
 * @author soup
 *
 */
public class MeetingRoomsII {

	public int minMeetingRooms(Interval[] intervals) {
		if (intervals == null || intervals.length == 0) {
			return 0;
		}

		if (intervals.length == 1) {
			return 1;
		}

		Arrays.sort(intervals, new Comparator<Interval>() {
			@Override
			public int compare(Interval interval1, Interval interval2) {
				int startCompare = interval1.start - interval2.start;
				if (startCompare != 0) {
					return startCompare;
				}

				return interval1.end - interval2.end;
			}
		});

		List<Integer> bucket = new ArrayList<>();
		Interval previous = intervals[0];
		bucket = this.addEndReturnSize(bucket, previous, true);
		int max = 1;
		for (int i = 1; i < intervals.length; i++) {
			if (previous.end > intervals[i].start) {
				bucket = this.addEndReturnSize(bucket, intervals[i], true);
				max = Math.max(max, bucket.size());
			} else {
				bucket = this.addEndReturnSize(bucket, intervals[i], true);
			}
			previous = intervals[i];
		}

		return max;
	}

	private List<Integer> addEndReturnSize(List<Integer> bucket, Interval interval, boolean add) {
		List<Integer> newList = new ArrayList<>();

		for (int i = 0; i < bucket.size(); i++) {
			if (bucket.get(i) > interval.start) {
				newList.add(bucket.get(i));
			}
		}
		if (add) {
			newList.add(interval.end);
		}
		return newList;
	}

}
