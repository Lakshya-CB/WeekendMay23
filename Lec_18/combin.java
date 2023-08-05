package Lec_18;

public class combin {
	public static void main(String[] args) {
//		solvePT(2, -1, 4, "");
		solveSeat(0, 2, "", 3);
	}

//wrt PT teacher
	public static void solvePT(int r, int prev, int total, String path) {
		if (r == 0) {
			System.out.println(path);
			return;
		}
		for (int curr = prev + 1; curr < total; curr++) {
			solvePT(r - 1, curr, total, path + "b" + curr);
		}
	}

//	wrt Seat
	public static void solveSeat(int idx, int QTP, 
			String path, int total_seats) {
		if(QTP==0) {
			System.out.println(path);
			return;
		}
		if(idx==total_seats) {
			return;
		}
		
		solveSeat(idx+1, QTP-1, path+"Q"+idx, total_seats);
		solveSeat(idx+1, QTP, path, total_seats);	
	}
}
