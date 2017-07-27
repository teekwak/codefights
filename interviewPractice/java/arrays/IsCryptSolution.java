import java.util.*;

public class IsCryptSolution {
	static int decodeWord(String word, Map<Character, Integer> solutionMap) {
		int sum = 0;

		for(char c : word.toCharArray()) {
			sum = (sum * 10) + solutionMap.get(c);
		}

		return sum;
	}

	static boolean isCryptSolution(String[] crypt, char[][] solution) {
		Map<Character, Integer> solutionMap = new HashMap<>();
		for(int i = 0; i < solution.length; i++) {
			solutionMap.put(solution[i][0], Character.getNumericValue(solution[i][1]));
		}

		for(String word : crypt) {
			if(solutionMap.get(word.charAt(0)) == 0 && word.length() > 1) {
				return false;
			}
		}

		return decodeWord(crypt[0], solutionMap) + decodeWord(crypt[1], solutionMap) == decodeWord(crypt[2], solutionMap);
	}


	public static void main(String[] args) {
		// String[] crypt = {"SEND", "MORE", "MONEY"};

		// char[][] solution = {{'O', '0'},
  //           {'M', '1'},
  //           {'Y', '2'},
  //           {'E', '5'},
  //           {'N', '6'},
  //           {'D', '7'},
  //           {'R', '8'},
  //           {'S', '9'}};

// String[] crypt = {"TEN", "TWO", "ONE"};

// char[][] solution = {{'O', '1'},
//             {'T', '0'},
//             {'W', '9'},
//             {'E', '5'},
//             {'N', '4'}};

		String[] crypt = {"A", "A", "A"};
		char[][] solution = {{'A', '0'}};

    System.out.println(isCryptSolution(crypt, solution));
	}
}