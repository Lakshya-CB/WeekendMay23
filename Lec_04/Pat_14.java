package Lec_04;

public class Pat_14 {
	public static void main(String[] args) {
		int n = 5;
		int r = 1;
		int total_st = 1;
		int total_sp = n - 1;
		while (r <= 2 * n - 1) {

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
			System.out.println();
			if(r<=n) {
				total_sp--;
				total_st++;
			}else {
				total_sp++;
				total_st--;
				
			}

		}
	}
}
