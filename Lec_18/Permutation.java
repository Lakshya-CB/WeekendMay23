package Lec_18;

import java.util.Arrays;

public class Permutation {
	public static void main(String[] args) {
		int n = 3;
		int r = 2;

		pick(r, new boolean[n], "", n);
	}

	public static void pick(int r, boolean[] isPicked, String path, int total_boxes) {
		if (r == 0) {
			System.out.println(path);
			System.out.println(Arrays.toString(isPicked));
			System.out.println("===============");
			return;
		}
		for (int curr = 0; curr < total_boxes; curr++) {
			if (isPicked[curr] == false) {
				isPicked[curr] = true;
				pick(r - 1, isPicked, path + "b" + curr, total_boxes);
				isPicked[curr] = false;
			}
		}
		
	}
}
