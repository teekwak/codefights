import java.util.*;

public class Minesweeper1 {
	static class Mine {
		int down;
		int right;

		Mine(int d, int r) {
			this.down = d;
			this.right = r;
		}
	}

	void reduceMineCounters(int[][] gameboard, int down, int right) {
		for(int y = -1; y <= 1; y++) {
			for(int x = -1; x <= 1; x++) {
				if(y != down || x != right) {
					try {
						if(gameboard[down + y][right + x] != 9) {
							gameboard[down + y][right + x]--;
						}
					} catch (ArrayIndexOutOfBoundsException e) {
						continue;
					}
				}
			}
		}
	}

	void removeAllMines(int[][] gameboard, List<Mine> mines) {
		for(Mine mine : mines) {
			gameboard[mine.down][mine.right] = 0;
		}
	}

	boolean allSquaresEqualZero(int[][] gameboard) {
		for(int down = 0; down < gameboard.length; down++) {
			for(int right = 0; right < gameboard[0].length; right++) {
				if(gameboard[down][right] != 0) {
					return false;
				}
			}
		}

		return true;
	}

	boolean minesweeper1(int[][] gameboard) {
		List<Mine> mines = new ArrayList<>();

		for(int down = 0; down < gameboard.length; down++) {
			for(int right = 0; right < gameboard[0].length; right++) {
				if(gameboard[down][right] == 9) {
					mines.add(new Mine(down, right));
					reduceMineCounters(gameboard, down, right);
				}
			}
		}

		removeAllMines(gameboard, mines);
		return allSquaresEqualZero(gameboard);
	}

	public static void main(String[] args) {
		Minesweeper1 obj = new Minesweeper1();

		int[][] gameboard = new int[][] {
			{0, 1, 9, 1},
			{0, 1, 1, 1},
			{0, 0, 0, 0}
		};

		System.out.println(obj.minesweeper1(gameboard));
	}
}