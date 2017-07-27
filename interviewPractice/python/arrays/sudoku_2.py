def valid_values(values):
	numbers = list(filter((lambda value: value != '.'), values))
	return False if len(numbers) > len(set(numbers)) else True

def sudoku_2(grid):
	for row in grid:
		if not valid_values(row):
			return False

	for i in range(0, len(grid[0])):
		if not valid_values([row[i] for row in grid]):
			return False

	for i in range(0, 3):
		for j in range(0, 3):
			subgrid = []
			for m in range(0, 3):
				for n in range(0, 3):
					subgrid.append(grid[i * 3 + m][j * 3 + n])

			if not valid_values(subgrid):
				return False

	return True

if __name__ == '__main__':
	print(sudoku_2(
		[[".",".",".","1","4",".",".","2","."],
		 [".",".","6",".",".",".",".",".","."],
		 [".",".",".",".",".",".",".",".","."],
		 [".",".","1",".",".",".",".",".","."],
		 [".","6","7",".",".",".",".",".","9"],
		 [".",".",".",".",".",".","8","1","."],
		 [".","3",".",".",".",".",".",".","6"],
		 [".",".",".",".",".","7",".",".","."],
		 [".",".",".","5",".",".",".","7","."]]
		) == True)

	print(sudoku_2(
		[[".",".",".",".","2",".",".","9","."],
		 [".",".",".",".","6",".",".",".","."],
		 ["7","1",".",".","7","5",".",".","."],
		 [".","7",".",".",".",".",".",".","."],
		 [".",".",".",".","8","3",".",".","."],
		 [".",".","8",".",".","7",".","6","."],
		 [".",".",".",".",".","2",".",".","."],
		 [".","1",".","2",".",".",".",".","."],
		 [".","2",".",".","3",".",".",".","."]]
		 ) == False)
