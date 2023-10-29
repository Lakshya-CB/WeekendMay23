package Lec_DP;

import java.util.PriorityQueue;

public class contraint_sum {

}

class Solution {
	public int constrainedSubsetSum(int[] arr, int k) {
		PriorityQueue<int[]> PQ = new PriorityQueue<>((a, b) -> {
			return -a[0] + b[0];
		});

		int max_ans = 0;
		PQ.add(new int[] { 0, arr.length - 1 });
		for (int curr = arr.length - 1; curr >= 0; curr--) {
			while (!PQ.isEmpty() && PQ.peek()[1] > curr + k) {
				PQ.poll();
			}
			// int ans = 0;
			int ans = arr[curr] + Math.max(0, PQ.peek()[0]);
			max_ans = Math.max(max_ans, ans);
			PQ.add(new int[] { ans, curr });
			// System.out.println(curr+"===========");
			// for(int[] ali:PQ){
			// System.out.print("{"+ali[0]+"-"+ali[1]+"}");
			// }
			// System.out.println();
		}
//  if all -ve!
		if (max_ans == 0) {
			max_ans = Integer.MIN_VALUE;
			for (int ali : arr) {
				max_ans = Math.max(max_ans, ali);
			}
		}
		return max_ans;
	}

	public int constrainedSubsetSum1(int[] arr, int k) {
		int max_ans = 0;
		int dp[] = new int[arr.length + 10];
		for (int curr = arr.length; curr >= -1; curr--) {
			if (curr >= arr.length) {
				dp[curr + 1] = 0;
			}
			int ans = 0;
			for (int i = curr + 1; i <= curr + k && i < arr.length; i++) {
				ans = Math.max(ans, arr[i] + dp[i + 1]);
			}
			dp[curr + 1] = ans;
			max_ans = Math.max(max_ans, ans);
		}
//      if all -ve!
		if (max_ans == 0) {
			max_ans = Integer.MIN_VALUE;
			for (int ali : arr) {
				max_ans = Math.max(max_ans, ali);
			}
		}
		return max_ans;
	}
}
