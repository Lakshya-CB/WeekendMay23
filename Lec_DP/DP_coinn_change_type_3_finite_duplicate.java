package Lec_DP;

import java.util.Arrays;
import java.util.Scanner;

public class DP_coinn_change_type_3_finite_duplicate {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int Amount = 10;
		int[] coins = { 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4 };
		Arrays.sort(coins);
		System.out.println("=>" + solve(Amount, -1, "", coins));
		System.out.println(BU(Amount, coins));
	}

	public static int solve(int A, int prev_idx, String path, int[] coins) {
		if (A == 0) {
//			System.out.println(path);
			return 1;
		}
		if (A < 0) {
			return 0;
		}
		int ans = 0;
		for (int i = prev_idx + 1; i < coins.length; i++) {
			if (i == prev_idx + 1 || coins[i] != coins[i - 1]) {
				int sp = solve(A - coins[i], i, path + coins[i], coins);
				ans = ans + sp;
			}
		}
		return ans;
	}

	public static int BU(int Amount, int[] coins) {
		int[][] dp = new int[Amount + 10][coins.length + 10];
		for (int A = 0; A <= Amount; A++) {
			int sum = 0;
			for (int prev_idx = coins.length - 1; prev_idx >= -1; prev_idx--) {

//				dp[A][prev_idx+1] => solve(A,prev_idx)!!
				if (A == 0) {
					dp[A][prev_idx + 1] = 1;
					continue;
				}
				int ans = 0;
				for (int i = prev_idx + 1; i < coins.length; i++) {
					if (i == prev_idx + 1 || coins[i] != coins[i - 1]) {
						if (A - coins[i] >= 0) {
							int sp = 0;
							sp = dp[A - coins[i]][i + 1];
							ans = ans + sp;
						}
					}
				}
				dp[A][prev_idx + 1] = ans;
			}
		}
		return dp[Amount][-1 + 1];

	}

	public static int BU2(int Amount, int[] coins) {
		int[][] dp = new int[Amount + 10][coins.length + 10];
		for (int A = 0; A <= Amount; A++) {
			int ans = 0;
			for (int prev_idx = coins.length - 1; prev_idx >= -1; prev_idx--) {

//				dp[A][prev_idx+1] => solve(A,prev_idx)!!
				if (A == 0) {
					dp[A][prev_idx + 1] = 1;
					continue;
				}
//				for (int i = prev_idx + 1; i < coins.length; i++) {
//					if (i == prev_idx + 1 || coins[i] != coins[i - 1]) {
//						if (A - coins[i] >= 0) {
//							int sp = 0;
//							sp = dp[A - coins[i]][i + 1];
//							ans = ans + sp;
//						}
//					}
//				}
			

				dp[A][prev_idx + 1] = ans;
			}
		}
		return dp[Amount][-1 + 1];

	}

//	private void lll() {
//		// TODO Auto-generated method stub
//		int pref_sum = 0;
//		for (int prev_idx = 10; prev_idx >= -1; prev_idx--) {
//
//
////			for (int i = prev_idx; i <= 10; i++) {	
////						sp = dp[A - coins[i]][i + 1];
////						ans = ans + sp;	
////						
////			}
//			pref_sum = pref_sum+ dp[A - coins[prev_idx]][prev_idx + 1];
//	}
//	}
}
