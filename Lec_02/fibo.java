package Lec_02;

public class fibo {
	public static void main(String[] args) {
		int n = 5;
		int cnt = 1;
		
		
		int a = 0;
		int b = 1;
		while (cnt<=n) {
			/////////////
			int c = a + b;
			a = b;
			b = c;
			////////////////
			cnt = cnt +1;
		}
		System.out.println(a);
	}
}
