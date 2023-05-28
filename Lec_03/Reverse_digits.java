package Lec_03;

public class Reverse_digits {
	public static void main(String[] args) {
		int n = 12345;

		int ans = 0;
		while (n > 0) {
			int digit = n % 10;
			ans = ans *10 + digit;
//			System.out.print(digit);
			n = n / 10;
		}
		System.out.println(ans);
	}
}
