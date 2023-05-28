package Lec_03;

import java.util.Scanner;

public class print_serires {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N1 = scn.nextInt();
		int N2 = scn.nextInt();
		int cnt = 1;
		
		int n = 1;
		while (cnt<=N1) {
			int num = 3 * n + 2;
			if (num % N2 != 0) {
				System.out.println(num);
				cnt=cnt+1;
			}
			n = n + 1;
		}
	}
}
