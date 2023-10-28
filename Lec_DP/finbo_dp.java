package Lec_DP;

public class finbo_dp {
	public static void main(String[] args) {
//		System.out.println(fibo(10));
		int n = 8000;
		System.out.println(fibo_TD(n, new Integer[n + 1]));
//		Integer[] dp = new Integer[2];
//		System.out.println(dp[0]);
//		System.out.println(dp[1]);		
	}

	public static int fibo_TD(int n, Integer[] dp) {
		if (n <= 1) {
			return n;
		}
//		if current solution is already calculated just return that!!
		if (dp[n] != null) {
			return dp[n];
		}
		int sp1 = fibo_TD(n - 1, dp);
		int sp2 = fibo_TD(n - 2, dp);
		dp[n] = sp1 + sp2; // nth fibo is being stored at nth index!
		return sp1 + sp2;

	}

	public static int BU(int N) {
//		n represents current problem
//		N represent Biggest problem
//		Step 6) crosscheck dp array size!!
		int[] dp = new int[N + 1];
		// Step 1) Array iteratively and dont think about the size!!

//		Step 2) Loop!! => smallest to Biggest problem!
		for (int n = 0; n <= N; n++) {
//			Step 4) Base case!!
			if (n <= 1) {
				dp[n]=n;
				continue;
			}
//			Step 3) dp[n]!!
			int sp1 = dp[n - 1];
			int sp2 = dp[n - 2];
			dp[n] = sp1 + sp2; // nth fibo is being stored at nth index!
		}
//		Step 5) return biggest problem
		return dp[N];

	}

	public static int fibo(int n) {
		if (n <= 1) {
			return n;
		}
		int sp1 = fibo(n - 1);
		int sp2 = fibo(n - 2);

		return sp1 + sp2;

	}
}
