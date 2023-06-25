package Lec_11;

public class array_2D_QPS {
	public static void main(String[] args) {
		int[][] arr = {
				{ 11, 12, 13, 14 ,15} };
//		wavey(arr);
		spiral(arr);

	}
	public static boolean find(int[][] arr, int ali) {
		int r = arr.length-1;
		int c = 0;
		while(r>=0 && c<arr[0].length) {
			if(arr[r][c]<ali) {
				c++;
			}else if(arr[r][c]>ali) {
				r--;
			}else {
				return true;
			}
		}
		return false;
	}

	public static void spiral(int[][] arr) {
		int rs = 0;
		int cs = 0;
		int re = arr.length - 1;
		int ce = arr[0].length - 1;
		int cnt = 0;
		int lim = arr.length * arr[0].length;
		while (rs<=re && cs<=ce) {
			for (int r = rs; r <= re && cnt<lim; r++) {
				System.out.print(arr[r][cs] + " ");
				cnt++;
			}
			System.out.println();

			for (int c = cs + 1; c <= ce && cnt<lim; c++) {
				System.out.print(arr[re][c] + " ");
				cnt++;
			}
			System.out.println();

			for (int r = re - 1; r >= rs && cnt<lim; r--) {
				System.out.print(arr[r][ce] + " ");
				cnt++;
			}
			System.out.println();

			for (int c = ce - 1; c >= cs + 1 && cnt<lim; c--) {
				System.out.print(arr[rs][c] + " ");
				cnt++;
			}

			System.out.println();
			rs++;re--;
			cs++;ce--;
		}

	}

	public static void wavey(int[][] arr) {
		for (int c = 0; c < arr[0].length; c++) {
			if (c % 2 == 0) {
				for (int r = 0; r < arr.length; r++) {
					System.out.println(arr[r][c]);
				}
			} else {
				for (int r = arr.length - 1; r >= 0; r--) {
					System.out.println(arr[r][c]);
				}

			}
		}
	}
}
