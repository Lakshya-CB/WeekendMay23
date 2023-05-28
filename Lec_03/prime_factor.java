package Lec_03;

public class prime_factor {
	public static void main(String[] args) {
		int n = 12;
		int div = 2;
		while (n>1) {
			int rem = n % div;
			if (rem == 0) {
				System.out.println(div);
				n = n / div;
			} else {
				div = div + 1;
			}
		}
	}
}
