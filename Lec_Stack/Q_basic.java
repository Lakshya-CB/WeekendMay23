package Lec_Stack;

import java.util.LinkedList;
import java.util.Queue;

public class Q_basic {
	public static void main(String[] args) {
		Queue<Integer> Q = new LinkedList<>();
		Q.add(10);
		Q.add(20);
		Q.add(30);
		Q.add(40);
		Q.add(50);
		disp(Q);
//		System.out.println(Q); 
	}

	public static void disp(Queue<Integer> Q) {
		for (int i = 0; i < Q.size(); i++) {
			System.out.print(Q.peek()+ " ,");
			Q.add(Q.poll());
		}
		System.out.println();

	}
}
