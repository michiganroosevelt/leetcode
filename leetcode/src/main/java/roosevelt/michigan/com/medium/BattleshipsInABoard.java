package roosevelt.michigan.com.medium;

/**
 * 
 * @author soup
 *
 */
public class BattleshipsInABoard {

	public int countBattleships(char[][] board) {
		int shipCount = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 'X') {
					destroyShip(i, j, board);
					shipCount++;
				}
			}
		}

		return shipCount;
	}

	private void destroyShip(int i, int j, char[][] board) {
		board[i][j] = '.';

		if (j + 1 < board[i].length && board[i][j + 1] == 'X') {
			for (j = j + 1; j < board[i].length; j++) {
				if (board[i][j] == 'X') {
					board[i][j] = '.';
				} else {
					return;
				}
			}
		} else if (i + 1 < board.length && board[i + 1][j] == 'X') {
			for (i = i + 1; i < board.length; i++) {
				if (board[i][j] == 'X') {
					board[i][j] = '.';
				} else {
					return;
				}
			}
		}
	}

}
