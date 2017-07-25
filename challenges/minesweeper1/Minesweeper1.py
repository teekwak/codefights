# Let's try Minesweeper!
# Each cell of Minesweeper gameboard can be:

# a mine (appears as 9)
# or a number representing the number of mines in its surrounding cells
# (a cell is considered as surrounding another cell when this cell meets that cell on at least 1 corner) (appears as 0 - 8)
# Your task is to check whether a gameboard is a valid gameboard.

def minesweeper1(g):
	s = sum([x for r in g for x in r if x != 9])
	for m in sum([[(i, j) for j,c in enumerate(r) if c == 9] for i,r in enumerate(g)], []):
		for a in range(m[0] - 1, m[0] + 2):
			for b in range(m[1] - 1, m[1] + 2):
				if 0 <= a < len(g) and 0 <= b < len(g[0]) and g[a][b] != 9:
					s -= 1

	return s == 0

if __name__ == '__main__':
	g = [[0, 1, 9, 9], [0, 1, 2, 2], [0, 0, 0, 0]] # True
	print(minesweeper1(g))