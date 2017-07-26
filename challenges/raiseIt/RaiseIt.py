# This is a reverse challenge, enjoy!

raiseIt = lambda a: sum((x // 10) ** (x % 10) for x in a)

if __name__ == '__main__':
	print(raiseIt([11, 22, 33] )) # 32
	print(raiseIt([14, 22, 31])) # 8
	print(raiseIt([42])) # 16
	print(raiseIt([90, 70, 50, 30, 10])) # 5
	print(raiseIt([13])) # 1
	print(raiseIt([20, 21, 22, 23, 24, 25, 26, 27, 28, 29])) # 1023
	print(raiseIt([10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50])) # 380083