package Lec_DP;

import java.util.Scanner;

public class DP_coinn_change_type_2_finite_unique {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int Amount = 5;
		int[] coins = { 2, 2, 3, 3, 3, 5 };

		System.out.println("=>" + solve(Amount, 0, "", coins, new Integer[Amount + 1][coins.length]));
	}

	public static int solve(int A, int idx, String path, int[] coins, Integer[][] dp) {
		if (A == 0) {
			System.out.println(path);
			return 1;
		}
		if (A < 0 || idx == coins.length) {
			return 0;
		}
//		if (dp[A][idx] != null) {
//			return dp[A][idx];
//		}
		int sp1 = solve(A - coins[idx], idx + 1, path + coins[idx], coins, dp);
		int sp2 = solve(A, idx + 1, path, coins, dp);
//	solve(a,idx)=>
		dp[A][idx] = sp1 + sp2;

		return sp1 + sp2;

	}
}
