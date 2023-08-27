package Lec_23;

public class Powerrrrrrrrrrrrrrrrr {
	

	public static int pow(int a, int n) {
		if(n==0) {
			return 1;
		}
		int sp1 = pow(a, n / 2);
		if (n % 2 == 0) {
			return sp1 * sp1;
		} else {
			return sp1 * sp1 * a;
		}
	}
}
