def is_crypt_solution(crypt, solution):
	dictionary = dict(solution)
	numbers = []

	for word in crypt:
		numberStr = ''

		for letter in word:
			numberStr += dictionary[letter]

		if numberStr[0] == '0' and len(numberStr) > 1:
			return False

		numbers.append(int(numberStr))

	return numbers[0] + numbers[1] == numbers[2]

if __name__ == '__main__':
	print(is_crypt_solution(["SEND", "MORE", "MONEY"], [["O","0"], ["M","1"], ["Y","2"], ["E","5"], ["N","6"], ["D","7"], ["R","8"], ["S","9"]]) == True)
	print(is_crypt_solution(["TEN", "TWO", "ONE"], [["O","1"], ["T","0"], ["W","9"], ["E","5"], ["N","4"]]) == False)
