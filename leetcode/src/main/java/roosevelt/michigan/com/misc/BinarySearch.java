package roosevelt.michigan.com.misc;

public class BinarySearch {
	
	private int range = 100000;
	
	
	public int findNumber(int x) {
		int lower = 1;
		int upper = range;
		int mid = (upper-lower)/2;
		
		while( true ) {
			if( mid == x ) {
				return x;
			} else if( mid < x ) {
				lower = mid;
				mid = mid + ((upper-lower)/2);
			} else {
				upper = mid;
				mid = mid - ((upper-lower)/2);
			}
		}
	}

}
