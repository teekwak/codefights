public class FirstNotRepeatingCharacter {
	char firstNotRepeatingCharacter(String s) {
    int[] firstPosition = new int[256];
    Arrays.fill(firstPosition, -1);

    int[] charCount = new int[256];
    Arrays.fill(charCount, 0);

    for(int i = 0; i < s.length(); i++) {
        if(firstPosition[s.charAt(i)] == -1) {
            firstPosition[s.charAt(i)] = i;
        }

        charCount[s.charAt(i)]++;
    }

    int min = Integer.MAX_VALUE;
    char c = '_';
    for(int i = 0; i < 256; i++) {
        if(charCount[i] == 1 && firstPosition[i] < min) {
            min = firstPosition[i];
            c = (char)i;
        }
    }

    return c;
	}

	public static void main(String[] args) {
		System.out.println(new FirstNotRepeatingCharacter().firstNotRepeatingCharacter("abacabad"));
	}
}