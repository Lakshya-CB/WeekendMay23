package Lec_13;

public class Rec_basics_1 {
	public static void main(String[] args) {
//		PI(4);
		PD(4);
	}

	public static void PI(int n) {
		if (n == 1) {
			System.out.println(1);
			return;
		}
//		BP : PI(n)
//		SP : PI(n-1)
		PI(n - 1);
		System.out.println(n);
	}

	public static void PD(int n) {
		if(n==0) {
			return;
		}
//	BP : PD(n)
//	SP : PD(n-1)
		System.out.println(n);
		PD(n - 1);

	}
	
	public static void PDI(int n) {
		if(n==0) {
			return;
		}
//		BP : PDI(n)
//		SP : PDI(n-1)
		System.out.println(n);
		PDI(n-1);
		System.out.println(n);
	}
	
	public static void PID(int s, int e) {
		if(s>e) {
			return;
		}
//		BP : PID(s,e)
//		SP : PID(s+1,e)
		System.out.println(s);
		PID(s+1, e);
		System.out.println(s);
	}
}
