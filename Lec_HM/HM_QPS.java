package Lec_HM;

import java.util.HashMap;
import java.util.HashSet;

public class HM_QPS {
	public static void main(String[] args) {
//		int[] arr1 = { 30, 20, 40, 50, 70, 30, 20, 20, 50, 50 };
//		int[] arr2 = { 50, 80, 30, 20, 20, 20, 90, 50, 20 };
//		Intersection(arr1, arr2);
		
		int[] arr = {2,12,9,16,10,5,3,20,25,11,1,8,6};
		longestChain(arr);
	}

	public static void Intersection(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> HM = new HashMap<>();
		for (int ali : arr2) {
//			HM.put(ali, 1);
//			int prev_freq = 0;
//			if (HM.containsKey(ali)) {
//				prev_freq = HM.get(ali);
//			}
			int prev_freq = HM.getOrDefault(ali, 0);
			HM.put(ali, prev_freq + 1);
		}
		System.out.println(HM);
		for (int ali : arr1) {
			if (HM.containsKey(ali) && HM.get(ali) > 0) {
				int prev_freq = HM.get(ali);
				HM.put(ali, prev_freq - 1);
				System.out.println(ali);
			}
		}
	}

	public static void longestChain(int[] arr) {
		HashSet<Integer> Set = new HashSet<>();
		for(int ali: arr) {
			Set.add(ali);
		}
		for(int ali: Set) {
			if(!Set.contains(ali-1)) {
				int head = ali;
				int temp = head;
				while(Set.contains(temp)) {
					System.out.print(temp + "=>");
					temp++;
				}
				System.out.println();
			}
		}
	}
}
