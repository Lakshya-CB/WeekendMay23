package Lec_PQ_HashMap;

import java.util.PriorityQueue;

public class PQ_Demo {
	public static void main(String[] args) {
		PriorityQueue<Integer> PQ = new PriorityQueue<>();
//		min heap!! = > rank!!
		PQ.add(10);
		PQ.add(15);
		PQ.add(2);
		PQ.add(6);
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());

	}

	public static void largestKelements(int[] arr, int k) {
		PriorityQueue<Integer> PQ = new PriorityQueue<>();
		for(int ali : arr) {
			PQ.add(ali);
			if(PQ.size()>k) {
				PQ.poll();
			}
		}
	}
}
