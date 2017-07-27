import java.util.Arrays;

// rotate 90 degrees clockwise
public class RotateImage {
	int[][] rotateImage(int[][] a) {
		int n = a.length;

		for(int layer = 0; layer < n / 2; layer++) {
			int last = n - 1 - layer;
			for(int i = layer; i < last; i++) {
				int offset = i - layer;
				int temp = a[layer][i];

				a[layer][i] = a[last - offset][layer];
				a[last - offset][layer] = a[last][last - offset];
				a[last][last - offset] = a[i][last];
				a[i][last] = temp;
			}
		}

		return a;
	}

	public static void main(String[] args) {
		int[][] a = {
			{1, 2, 3},
     	{4, 5, 6},
     	{7, 8, 9}
    };

    for(int[] line : new RotateImage().rotateImage(a)) {
    	System.out.println(Arrays.toString(line));
    }
	}
}