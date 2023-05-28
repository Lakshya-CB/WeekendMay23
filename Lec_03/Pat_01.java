package Lec_03;

public class Pat_01 {
	public static void main(String[] args) {
		int n = 9;
		int row = 1;
		while(row<=n) {
			int cnt_st = 0;
			while(cnt_st<n) {
				System.out.print("* ");
				cnt_st++;
			}
			
			
			row++;
			System.out.println();
		}
	}
}
