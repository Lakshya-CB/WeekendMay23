package Lec_DP;

public class climb_sta_dp {
	public static int climbStairs(int curr, int N) {
		if (curr == N) {
			return 1;
		}
		if (curr > N) {
			return 0;
		}
		int sp1 = climbStairs(curr + 1, N);
		int sp2 = climbStairs(curr + 2, N);
		return sp1 + sp2;
	}

	public static int climbStairsTD(int curr, int N, Integer[] dp) {
		if (curr == N) {
			return 1;
		}
		if (curr > N) {
			return 0;
		}
//		if current solution already calculated hein!! use it!!
		if(dp[curr]!=curr) {
			return dp[curr];
		}
		int sp1 = climbStairsTD(curr + 1, N, dp);
		int sp2 = climbStairsTD(curr + 2, N, dp);
//		CB(curr)!!
		dp[curr] = sp1 + sp2;
		return sp1 + sp2;
	}
	public static int BU(int N) {
//		Step 1) dp array!!
		int[] dp = new int[N+2];
//		Step 2)
		for(int curr = N; curr>=0;curr--) {
//			Step 3)!! current !!
//			dp[curr] => 
			if (curr == N) {
				dp[curr]= 1;
				continue;
			}
			int sp1 = dp[curr + 1];
			int sp2 = dp[curr + 2];
//			CB(curr)!!
			dp[curr] = sp1 + sp2;
		}
		return dp[0];
		
	}
}
