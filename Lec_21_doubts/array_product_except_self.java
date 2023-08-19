package Lec_21_doubts;

import java.util.Scanner;

public class array_product_except_self {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		solve3(arr);
	}

	public static void solve3(int[] arr) {
		long[] R_Arr = new long[arr.length];
		long R = 1; 
		for(int i = arr.length-1;i>=0;i--) {
			R_Arr[i] = R;
			R = R*arr[i];
		}
		long L = 1;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(L * R_Arr[i] + " ");
			L = L * arr[i];
		}
	}

	public static void solve2(int[] arr) {
		long L = 1;

		for (int i = 0; i < arr.length; i++) {
			long R = 1;
			for (int j = i + 1; j < arr.length; j++) {
				R = R * arr[j];
			}
			System.out.print(L * R + " ");
			L = L * arr[i];
		}
	}

	public static void solve1(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			long L = 1;

			for (int j = 0; j <= i - 1; j++) {
				L = L * arr[j];
			}
			long R = 1;
			for (int j = i + 1; j < arr.length; j++) {
				R = R * arr[j];
			}
			System.out.print(L * R + " ");

		}
	}

}
