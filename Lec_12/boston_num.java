package Lec_12;

import java.util.Scanner;

public class boston_num {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); 
		int num = scn.nextInt();
		int baackup = num;
		int div = 2;
		int sum =0;
		while(num>1) {
			if(num%div==0) {
				sum = sum +sumOfDig(div);
				num = num/div;
			}else {
				div++;
			}
		}
		if(sumOfDig(baackup)==sum) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}

	public static int sumOfDig(int num) {
		int ans = 0;
		while (num > 0) {
			ans = ans + num % 10;
			num = num / 10;
		}
		return ans;
	}
}
