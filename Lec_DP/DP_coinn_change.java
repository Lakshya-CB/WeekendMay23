package Lec_DP;

import java.util.Scanner;

public class DP_coinn_change {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int Amount = scn.nextInt();
		int[] coins = new int[scn.nextInt()];
		
		for(int i=0;i<coins.length;i++) {
			coins[i] = scn.nextInt();
			
		}
		System.out.println(BU(coins, Amount));
	}

	public static int solve(int A, int idx, int[] coins, Integer[][] dp) {
		if (A == 0) {
			return 1;
		}
		if (A < 0 || idx == coins.length) {
			return 0;
		}
		if (dp[A][idx] != null) {
			return dp[A][idx];
		}
		int sp1 = solve(A - coins[idx], idx, coins, dp);
		int sp2 = solve(A, idx + 1, coins, dp);
//	solve(a,idx)=>
		dp[A][idx] = sp1 + sp2;

		return sp1 + sp2;

	}

	public static int BU(int[] coins, int Amount) {
		int[][] dp = new int[Amount + 1][coins.length + 1];
		for (int idx = coins.length - 1; idx >= 0; idx--) {
			for (int A = 0; A <= Amount; A++) {

//				dp[A][idx]!!
				if (A == 0) {
					dp[A][idx] = 1;
					continue;
				}
				int sp1 = 0;
				if (A - coins[idx] >= 0) {
					sp1 = dp[A - coins[idx]][idx];
				}
				int sp2 = dp[A][idx + 1];
//			solve(a,idx)=>
				dp[A][idx] = sp1 + sp2;
			}
		}
		return dp[Amount][0];

	}
}
