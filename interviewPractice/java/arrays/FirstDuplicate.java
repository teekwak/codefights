import java.util.*;

public class FirstDuplicate {
	int firstDuplicate(int[] a) {
    Set<Integer> set = new HashSet<>();

    for(int num : a) {
      if(set.contains(num)) {
        return num;
      }

      set.add(num);
    }

    return -1;
	}

	public static void main(String[] args) {
		System.out.println(new FirstDuplicate().firstDuplicate(new int[]{2, 3, 3, 1, 5, 2}));
	}
}