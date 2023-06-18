package Lec_09;

public class Kadance_algo {
	public static void main(String[] args) {
		int[] arr = 
			{ -19, 5, -6, 4, 6, -7, 10, -90, 20, -19, 4 };
		System.out.println(MaxSubarraySum(arr));
	}
 
	public static int MaxSubarraySum(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for (int aloo : arr) {
			sum = sum + aloo;
			if (sum < 0) {
				sum = 0;
			}
			if(sum >ans) {
				ans = sum;
			}
		}
		return ans;
	}
}
