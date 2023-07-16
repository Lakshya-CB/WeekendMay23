package Lec_14;

public class Rec_basics_2 {
	public static void main(String[] args) {
//		System.out.println(Fac(4));
		System.out.println(Fibo(4));
	}

	public static int Fac(int n) {
		if (n == 0) {
			return 1;
		}
//		BP : Fac(n)
//		SP : Fac(n-1)
		int sp = Fac(n - 1);
		return sp * n;
	}

	public static int Pow(int a, int b) {
		// BP : Pow(a,b)
		// SP : Pow(a,b-1)
		if (b == 0) {
			return 1;
		}
		int sp = Pow(a, b - 1);
		return sp * a;
	}

	public static int Fibo(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		int sp1 = Fibo(n - 1);
		int sp2 = Fibo(n - 2);
		return sp1 + sp2;
	}
}
