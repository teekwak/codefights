def first_not_repeating_character(s):
	for letter in s:
		if s.find(letter) == s.rfind(letter):
			return letter

	return '_'

if __name__ == '__main__':
	print(first_not_repeating_character('abacabad') == 'c')
	print(first_not_repeating_character('abacabaabacaba') == '_')
	print(first_not_repeating_character('z') == 'z')
	print(first_not_repeating_character('bcb') == 'c')
	print(first_not_repeating_character('bcccccccb') == '_')
	print(first_not_repeating_character('abcdefghijklmnopqrstuvwxyziflskecznslkjfabe') == 'd')
	print(first_not_repeating_character('zzz') == '_')
	print(first_not_repeating_character('bcccccccccccccyb') == 'y')
	print(first_not_repeating_character('xdnxxlvupzuwgigeqjggosgljuhliybkjpibyatofcjbfxwtalc') == 'd')
	print(first_not_repeating_character('ngrhhqbhnsipkcoqjyviikvxbxyphsnjpdxkhtadltsuxbfbrkof') == 'g')
