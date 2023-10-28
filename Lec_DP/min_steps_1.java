package Lec_DP;

import java.util.HashMap;

public class min_steps_1 {
	public static void main(String[] args) {

	}

	public static int solve(int n) {
		if(n==1) {
			return 0;
		}
		if (n % 2 == 0) {
			return 1 + solve(n / 2);
		} else {
			int sp1 = 1 + solve(n + 1);
			int sp2 = 1 + solve(n - 1);
			return Math.min(sp1, sp2);
		}
	}
	public static int solveTD(int n,HashMap<Integer,Integer>dp) {
		if(n==1) {
			return 0;
		}
		if(dp.containsKey(n)) {
			return dp.get(n);
		}
		if (n % 2 == 0) {
			int an = 1 + solve(n / 2);
			dp.put(n,an);
			return an;
		} else {
			int sp1 = 1 + solve((n + 1)/2)+1;
			int sp2 = 1 + solve(n - 1);
			dp.put(n, Math.min(sp1, sp2));
			
			return Math.min(sp1, sp2);
		}
	}
}
