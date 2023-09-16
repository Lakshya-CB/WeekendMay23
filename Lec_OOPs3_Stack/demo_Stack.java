package Lec_OOPs3_Stack;

import java.util.Arrays;
import java.util.Stack;

public class demo_Stack {
	public static void main(String[] args) {
//		Stack<Integer> S = new Stack<>();
//		S.add(10);
//		S.add(20);
//		S.add(30);
//		S.add(40);
//
////		disp(S);
////		dispRec(S);
//
//		disp(S);
//		reverse(S);
//		disp(S);
//		
		int[] arr = {50,30,20,40,10,45,5,60,15,8};
//		nextGr8er(arr);
		nextGr8er2(arr);
	}

	public static void dispRec(Stack<Integer> S) {
		if (S.isEmpty()) {
			return;
		}
		int ali = S.pop();
		System.out.println(ali);
		dispRec(S);
		S.add(ali);
	}

	public static void copy(Stack<Integer> S, Stack<Integer> temp) {
		if (S.isEmpty()) {
			return;
		}
		int ali = S.pop();
		copy(S, temp);
		temp.add(ali);
//		S.add(ali);
	}

	public static void disp(Stack<Integer> S) {
		Stack<Integer> Temp = new Stack<>();
		while (!S.isEmpty()) {
//			System.out.println(S.pop());
			Temp.add(S.pop());
		}
		while (!Temp.isEmpty()) {
			int ali = Temp.pop();
			System.out.print(ali + " ");
			S.add(ali);
		}
		System.out.println();
	}

	public static void reverse(Stack<Integer> S) {
		Stack<Integer> temp = new Stack<>();
		copy(S, temp);
		while (!temp.isEmpty()) {
			S.add(temp.pop());
		}
	}

	public static void nextGr8er(int[] arr) {
		Stack<Integer> S = new Stack<>();
//		 {50,30,20,40,10,45,5,60,15,8};
		for (int B : arr) {
			while (!S.isEmpty() && S.peek() < B) {
				int A = S.pop();
				System.out.println(A + " => " + B);
			}
			S.add(B);
		}

	}
	public static void nextGr8er2(int[] arr) {
		Stack<Integer> S = new Stack<>();
		int[] ans = new int[arr.length];
//		 {50,30,20,40,10,45,5,60,15,8};
		for ( int idx = 0;idx<arr.length;idx++) {
			int B = arr[idx];
			while (!S.isEmpty() && arr[S.peek()] < B) {
				int A_idx = S.pop();
				ans[A_idx] = B;
				System.out.println(arr[A_idx] + " => " + B);
			}
			S.add(idx);
		}
		System.out.println(Arrays.toString(ans));

	}
}
