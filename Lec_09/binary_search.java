package Lec_09;

public class binary_search {
	public static void main(String[] args) {
		int[] Arr = { 5, 7, 11, 12, 15, 20, 31, 33, 35, 40, 45, 55, 58, 66, 71 };

	}

	public static boolean find(int[] arr, int ali) {
		int s = 0;
		int e = arr.length - 1;
		while (s<=e) {
			int mid = (s + e) / 2;
			if (arr[mid] == ali) {
				return true;
			} else if (ali > arr[mid]) {
				s = mid + 1;
			} else {
				e = mid - 1;
			}
		}
		return false;
	}
}
