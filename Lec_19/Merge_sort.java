package Lec_19;

import java.util.Arrays;

public class Merge_sort {
	public static void main(String[] args) {
//		int[] arr1 = { 10, 20, 30, 40, 50, 60 };
//		int[] arr2 = { 2, 3, 13, 40, 999 };
////		System.out.println(Arrays.toString(merge(arr1, arr2)));
		int[] arr = {5,6,3,8,2};
		System.out.println(Arrays.toString(sort(arr, 0, arr.length-1)));
	}

	public static int[] merge(int[] arr1, int[] arr2) {
		int[] ans = new int[arr1.length + arr2.length];
		int idx = 0;
		int idx1 = 0;
		int idx2 = 0;
		while (idx1 < arr1.length && idx2 < arr2.length) {
			if (arr1[idx1] <= arr2[idx2]) {
				ans[idx] = arr1[idx1];
				idx1++;
				idx++;
			} else {
				ans[idx] = arr2[idx2];
				idx2++;
				idx++;

			}
		}
		while (idx1 < arr1.length) {
			ans[idx] = arr1[idx1];
			idx1++;
			idx++;
		}
		while (idx2 < arr2.length) {
			ans[idx] = arr2[idx2];
			idx2++;
			idx++;
		}
		return ans;
	}

	public static int[] sort(int[] arr, int s, int e) {
		if(s==e) {
			int[] ans = new int[1];
			ans[0] = arr[s];
			return ans;
		}
	
		int mid = (s+e)/2;
		int[] sp1 = sort(arr, s, mid);
		int[] sp2 = sort(arr, mid+1, e);
		return merge(sp1, sp2);
	}
}
