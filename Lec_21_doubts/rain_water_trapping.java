package Lec_21_doubts;

public class rain_water_trapping {
	public static int solve1(int[] arr) {
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			int L = 0;
			for (int j = 0; j <= i; j++) {
				L = Math.max(L, arr[j]);
			}

			int R = 0;
			for (int j = i; j < arr.length; j++) {
				R = Math.max(R, arr[j]);
			}
			int curr = Math.min(L, R) - arr[i];

			ans = ans + curr;
		}
		return ans;
	}

	public static int solve2(int[] arr) {
		int ans = 0;
		int L = 0;
		int R = 0;
		int[] R_wall = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			R = Math.max(R, arr[i]);
			R_wall[i] = R;
		}
		for (int i = 0; i < arr.length; i++) {
			L = Math.max(L, arr[i]);
			int curr = Math.min(L, R_wall[i]) - arr[i];

			ans = ans + curr;
		}
		return ans;
	}

	public static int solve3(int[] arr) {
		int L = 0;
		int R = arr.length - 1;
		int L_wall = arr[0];
		int R_wall = arr[arr.length - 1];
		int ans = 0;
		while (L <= R) {
			if (L_wall <= R_wall) {
				int paani = L_wall - arr[L];
				L++;
				if (L < arr.length) {
					L_wall = Math.max(L_wall, arr[L]);
				}
				ans = ans + paani;
			} else {
				int paani = R_wall - arr[R];
				R--;
				if (R >= 0) {
					R_wall = Math.max(R_wall, arr[R]);
				}
				ans = ans + paani;
			}
		}
		return ans;
	}

}
