package roosevelt.michigan.com.medium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BattleshipsInABoardTest {

	private BattleshipsInABoard solution;

	@Before
	public void setup() {
		solution = new BattleshipsInABoard();
	}

	@Test
	public void testBattleshipsInABoardExample() {
		char[][] input = new char[][] { {'X', '.', '.','X'}, {'.','.','.','X'},{'.','.','.','X'}};
		
		int result = solution.countBattleships(input);

		Assert.assertEquals(2, result);
	}

	@Test
	public void testBattleshipsInABoard2by2() {
		char[][] input = new char[][] { {'X','X'},{'.','.'}};
		
		int result = solution.countBattleships(input);

		Assert.assertEquals(1, result);
	}
}
