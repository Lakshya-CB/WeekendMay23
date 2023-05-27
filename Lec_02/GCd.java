package Lec_02;

public class GCd {
	public static void main(String[] args) {
		int a = 17;
		int b = 32;

		int divisor = b;
		int dividend = a;
		while (divisor>0) {
			int rem = dividend % divisor;
			
			dividend  = divisor;
			divisor = rem;
		}
		System.out.println(dividend);
	}
}
