package Lec_17;

public class Coin_change_combination {
	public static void main(String[] args) {
		int[] coins = { 1, 2, 3 };
		int Amount = 3;
//		solve(Amount, 0, "", coins);
		solve_PT(Amount, 0,"", coins);
	}
	
	public static void solve(int A, int idx, String str, int[] coins) {
		if (A == 0) {
			System.out.println(str);
			return;
		}
		if (A < 0 || idx == coins.length) {
			return;
		}
		solve(A - coins[idx], idx, str + coins[idx], coins); // include
		solve(A, idx + 1, str, coins); // Exclude

	}

	public static void solve_PT(int A, int prev, String path, int[] coins) {
		if(A<0) {
			return;
		}
		if(A==0) {
			System.out.println(path);
		}
		for (int idx = prev; idx < coins.length; idx++) {
			solve(A-coins[idx], idx, path+coins[idx], coins);
		}
	}
	
	
}
