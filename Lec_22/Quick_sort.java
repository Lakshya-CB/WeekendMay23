package Lec_22;

public class Quick_sort {

	public static void quick(int s, int e, int[] arr) {
		if(s>=e) {
			return;
		}
		int pivot = arr[(s + e) / 2];
		int L = s;
		int R = e;
		while (L<=R) {
			while (arr[L] < pivot) {
				L++;
			}
			while (pivot < arr[R]) {
				R--;
			}
			if (L <= R) {
				int temp = arr[L];
				arr[L] = arr[R];
				arr[R] = temp;
				L++;
				R--;
			}
		}
		quick(s, R, arr);
		quick(L, e, arr);
	}
}
