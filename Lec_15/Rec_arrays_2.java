package Lec_15;

public class Rec_arrays_2 {
	public static void main(String[] args) {
		int[] arr = { 10, 22, 7, 8, 5 };
		System.out.println(Max(0, arr));
	}

	public static int Max(int s, int[] arr) {
		if (s == arr.length) {
			return Integer.MIN_VALUE;
		}
//	BP : Max(s)
//	SP : Max(s+1)
		int sp = Max(s + 1, arr);
		return Math.max(arr[s], sp);
	}

	public static int FO(int s, int ali, int[] arr) {
		if (s == arr.length) {
			return -1;
		}
		int sp = FO(s + 1, ali, arr);
		if (arr[s] == ali) {
			return s;
		} else {
			return sp;
		}
	}

	public static int LO(int s, int ali, int[] arr) {
		if (s == arr.length) {
			return -1;
		}
		int sp = LO(s + 1, ali, arr);
		if (sp == -1 && arr[s] == ali) {
			return s;
		} else {
			return sp;
		}
	}
}
