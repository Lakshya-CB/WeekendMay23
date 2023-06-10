package Lec_05;

public class Pat_09 {
	public static void main(String[] args) {
		int n = 5;
		int r = 1;
		int total_sp = n - 1;
		int total_st = 1;
		int ntp = 1;
		while (r <= n) {
			ntp = 1;
			int cnt_sp = 0;
			while (cnt_sp < total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
			int cnt_st = 0;
			while (cnt_st < total_st) {
				System.out.print(ntp + " ");
				cnt_st++;
				if (cnt_st <= total_st / 2) {
					ntp++;
				} else {
					ntp--;
				}
			}
			System.out.println();
			total_sp--;
			total_st = total_st + 2;
			r++;
		}
	}

}
