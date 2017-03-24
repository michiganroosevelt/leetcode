package roosevelt.michigan.com.easy;

/**
 * For a web developer, it is very important to know how to design a web page's
 * size. So, given a specific rectangular web page’s area, your job by now is to
 * design a rectangular web page, whose length L and width W satisfy the
 * following requirements:
 * 
 * 1. The area of the rectangular web page you designed must equal to the given
 * target area.
 * 
 * 2. The width W should not be larger than the length L, which means L >= W.
 * 
 * 3. The difference between length L and width W should be as small as
 * possible.
 * 
 * You need to output the length L and the width W of the web page you designed
 * in sequence.
 * 
 * @author soup
 *
 */
public class ConstructTheRectangle {
	public int[] constructRectangle(int area) {
		if (area % 2 != 0) {
			double squareRoot = Math.sqrt(area);
			if( area % squareRoot == 0 ) {
				return new int[]{(int)squareRoot, (int)squareRoot};
			}
			
			return new int[]{area,1};
		}

		int first = area / 2;
		int second = area / first;
		int length = 0;
		int width = 0;
		if( first > second ) {
			length = first;
			width = second;
		} else {
			length = second;
			width = first;
		}

		return new int[] { length, width };
	}
}
