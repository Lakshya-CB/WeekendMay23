package Lec_22;

import java.util.Scanner;

public class lexico_counting {
	public static void main(String[] args) {
//		System.out.println(0);
//		for (int d = 1; d <= 9; d++) {
//			solve(d, 1000);
//		}
			Scanner scn = new Scanner(System.in);
			solve(0, scn.nextInt());
			
		}
	
		public static void solve(int curr, int limit) {
			if (curr > limit) {
				return;
			}
			System.out.print(curr+" ");
	
			int d = 0;
			if (curr == 0) {
				d = 1;
			}
			for (; d <= 9; d++) {
				solve(curr * 10 + d, limit);
			}
		}
}
