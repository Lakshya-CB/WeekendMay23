package Lec_Q_LL;

import java.util.LinkedList;
import java.util.Queue;

public class Q_QPS {
	public static void main(String[] args) {

	}

	public static void firstNegWinK(int[] arr, int k) {
		Queue<Integer> Q = new LinkedList<>();
		for (int i = 0; i < k; i++) {
			if (arr[i] < 0) {
				Q.add(i);
			}
		}

		System.out.println(arr[Q.peek()]);
		for(int s =1;s<=arr.length-k;s++) {
			if(Q.peek()<s) {
				Q.poll();
			}
			int e = s+k-1;
			if(arr[e]<0) {
				Q.add(e);
			}
			System.out.println(arr[Q.peek()]);
		}
	}
}
