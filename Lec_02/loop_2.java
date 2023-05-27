package Lec_02;

public class loop_2 {
	public static void main(String[] args) {
		int n = 5;
		int cnt = 1;
		int sum = 0;
		while (cnt <= n) {
//			System.out.println(cnt);
			cnt = cnt + 1;
			sum = sum + cnt;

		}
		System.out.println(sum);
//		System.out.println(cnt);
	}
}
