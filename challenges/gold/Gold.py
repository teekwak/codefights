# Return the number of ways to write the given n as the sum of two prime numbers.

def gold(n):
	p = {x for x in range(2, n) if not any(x % y == 0 for y in range(2, int(x ** 0.5) + 1))}
	return len([a for a in p if (n - a) in p and n - a != p]) // 2

if __name__ == '__main__':
	print(gold(8)) 			# 1 -> 3+5
	print(gold(20)) 		# 2 -> 3+17 and 7+13
	print(gold(100)) 		# 6
	print(gold(101)) 		# 0
	print(gold(42)) 		# 4
	print(gold(655)) 		# 1
	print(gold(56344)) 	# 385
	print(gold(4))			# 0