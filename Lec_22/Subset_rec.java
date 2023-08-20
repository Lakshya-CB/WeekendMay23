package Lec_22;

import java.util.Scanner;

public class Subset_rec {
	static int cnt = 0;
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		int[] coins = new int[scn.nextInt()];
		for(int i=0;i<coins.length;i++) {
			coins[i] = scn.nextInt();
		}
		int A = scn.nextInt();
		solve(0, A, "", coins);
		System.out.println();
		System.out.println(cnt);
	}

	public static void solve(int idx, int A, String path, int[] coins) {
		if(A==0) {
			System.out.print(path+" ");
			cnt++;
			return;
		}
		if(A<0 || idx==coins.length) {
			return;
		}
		solve(idx+1, A-coins[idx], path+coins[idx]+" ", coins);
		
		solve(idx+1, A, path, coins);
		
		
	}
}
