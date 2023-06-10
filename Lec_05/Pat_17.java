package Lec_05;

public class Pat_17 {
	public static void main(String[] args) {
		int n = 13;
		int r = 1;
		int total_sp= 1;
		int total_st = n/2;
		while (r <= n) {
			int cnt_st =0;
			while(cnt_st<total_st) {
				System.out.print("* ");
				cnt_st++;
			}
			int cnt_sp =0;
			while(cnt_sp<total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
			int cnt_st2 =0;
			while(cnt_st2<total_st) {
				System.out.print("* ");
				cnt_st2++;
			}
			System.out.println();
			r++;
			if(r<=n/2+1) {
				total_st--;
				total_sp = total_sp+2;
			}else {
				total_st++;
				total_sp = total_sp-2;
				
			}
		}
	}
}
