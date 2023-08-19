package Lec_21_doubts;

import java.util.Scanner;

public class replcae_pi {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		while (T > 0) {
			T--;
			solve(scn.next(), "");
		}
	}

	public static void solve(String str, String path) {
		int idx = str.indexOf("pi");
		if (idx == -1) {
			System.out.println(path+str);
			return;
		}
		solve(str.substring(idx + 2), path + str.substring(0, idx) + 3.14);
	}
}
