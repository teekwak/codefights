import java.util.*;

public class Sudoku2 {
	boolean sudoku2(char[][] grid) {
		if(grid.length != 9 || grid[0].length != 9) {
			return false;
		}

		// check each row
		for(int i = 0; i < 9; i++) {
			Set<Character> rowValues = new HashSet<>();
			for(int j = 0; j < 9; j++) {
				if(grid[i][j] != '.') {
					if(rowValues.contains(grid[i][j])) {
						return false;
					}
					rowValues.add(grid[i][j]);
				}
			}
		}

		// check each column
		for(int i = 0; i < 9; i++) {
			Set<Character> columnValues = new HashSet<>();
			for(int j = 0; j < 9; j++) {
				if(grid[j][i] != '.') {
					if(columnValues.contains(grid[j][i])) {
						return false;
					}
					columnValues.add(grid[j][i]);
				}
			}
		}

		// check each subgrid
		for(int i = 0; i < 9; i += 3) {
			for(int j = 0; j < 9; j += 3) {
				// we are at the top left corner of the subgrid
				Set<Character> subgridValues = new HashSet<>();
				for(int k = i; k < i + 3; k++) {
					for(int m = j; m < j + 3; m++) {
						if(grid[k][m] != '.') {
							if(subgridValues.contains(grid[k][m])) {
								return false;
							}
							subgridValues.add(grid[k][m]);
						}
					}
				}
			}
		}

		return true;
	}

	public static void main(String[] args) {
		char[][] grid = {{'.', '.', '.', '.', '2', '.', '.', '9', '.'},
        {'.', '.', '.', '.', '6', '.', '.', '.', '.'},
        {'7', '1', '.', '.', '7', '5', '.', '.', '.'},
        {'.', '7', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '8', '3', '.', '.', '.'},
        {'.', '.', '8', '.', '.', '7', '.', '6', '.'},
        {'.', '.', '.', '.', '.', '2', '.', '.', '.'},
        {'.', '1', '.', '2', '.', '.', '.', '.', '.'},
        {'.', '2', '.', '.', '3', '.', '.', '.', '.'}};

    System.out.println(new Sudoku2().sudoku2(grid));
	}
}