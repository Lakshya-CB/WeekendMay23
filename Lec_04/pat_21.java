package Lec_04;

public class pat_21 {
	public static void main(String[] args) {
		int n = 5;
		int r = 1;
		int total_st = 1;
		int total_sp = 2*n-3;
		while(r<=n) {
			int cnt_st1=0;
			while(cnt_st1<total_st) {
				System.out.print("* ");
				cnt_st1++;
			}
			int cnt_sp = 0;
			while(cnt_sp < total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
			int cnt_st2 =0;
			if(r==n) {
				cnt_st2=1;
			}
			while(cnt_st2<total_st) {
				System.out.print("* ");
				cnt_st2++;
			}
			
			
			r++;
			System.out.println();
			total_st++;
			total_sp=total_sp-2;
		}
	}
}
