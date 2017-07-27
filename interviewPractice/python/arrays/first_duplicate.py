def first_duplicate(a):
	seen = set()
	unique = [num for num in a if num in seen or seen.add(num)]
	return unique[0] if len(unique) > 0 else -1

if __name__ == '__main__':
	print(first_duplicate([2, 3, 3, 1, 5, 2]) == 3)
	print(first_duplicate([2, 4, 3, 5, 1]) == -1)
	print(first_duplicate([1]) == -1)
	print(first_duplicate([2, 2]) == 2)
	print(first_duplicate([2, 1]) == -1)
	print(first_duplicate([2, 1, 3]) == -1)
	print(first_duplicate([2, 3, 3]) == 3)
	print(first_duplicate([3, 3, 3]) == 3)
	print(first_duplicate([8, 4, 6, 2, 6, 4, 7, 9, 5, 8]) == 6)
	print(first_duplicate([10, 6, 8, 4, 9, 1, 7, 2, 5, 3]) == -1)
	print(first_duplicate([1, 1, 2, 2, 1]) == 1)
