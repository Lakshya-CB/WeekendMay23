package Lec_03;

public class Pat_04 {
	public static void main(String[] args) {
		int n = 9;
		int r = 1;
		int total_sp = n - 1;
		int total_st = 1;
		while (r <= n) {
			int cnt_sp = 0;
			while (cnt_sp < total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}

			int cnt_st = 0;
			while (cnt_st < total_st) {
				System.out.print("* ");
				cnt_st++;
			}
			r++;
			total_sp--;
			total_st++;
			System.out.println();
		}
	}
}
