package Lec_OOPs_FInal;

import java.util.Stack;

public class LinkedList <OO> {
	class Node {
		public Node(OO ali) {
			// TODO Auto-generated constructor stub
			data = ali;
		}

		OO data;
		Node next;
	}

	Node head;

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " => ");
			temp = temp.next;
		}
		System.out.println();
	}

	public int size() {
		int s = 0;
		Node temp = head;
		while (temp != null) {
//			System.out.print(temp.data + " => ");
			s++;
			temp = temp.next;
		}
		return s;
	}

	public OO getFirst() {
		if (isEmpty()) {
			throw new RuntimeException("Kya deekh rha hain?");
		}
		return head.data;
	}

	public OO getLast() {
		if (isEmpty()) {
			throw new RuntimeException("Kya deekh rha hain?");
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}

	public OO getAt(int idx) {
		if (idx < 0 || idx >= size()) {
			throw new RuntimeException("Kya deekh rha hain?");
		}
		Node temp = head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(OO ali) {
		Node nn = new Node(ali);
		nn.next = head;
		head = nn;
	}

	private Node getNodeAt(int idx) {
		if (idx < 0 || idx >= size()) {
			throw new RuntimeException("Kya deekh rha hain?");
		}
		Node temp = head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void add(OO ali) {
		addLast(ali);
	}

	public void addLast(OO ali) {
		if (isEmpty()) {
			addFirst(ali);
			return;
		}
		Node last = getNodeAt(size() - 1);
		Node nn = new Node(ali);
		last.next = nn;
	}

	public void addAt(OO ali, int idx) {
		if (idx == 0) {
			addFirst(ali);
			return;
		}
		if (idx == size()) {
			addLast(ali);
			return;
		}
		Node curr = new Node(ali);
		Node prev = getNodeAt(idx - 1);
		Node after = prev.next;
		prev.next = curr;
		curr.next = after;
	}

	public OO removeLast() {
		if (isEmpty()) {
			throw new RuntimeException("Kya deekh rha hain?");
		}
		if (size() == 1) {
			return removeFirst();
		}
		Node secondLast = getNodeAt(size() - 2);
		Node last = secondLast.next;

		secondLast.next = null;
		return last.data;
	}

	public OO removeFirst() {
		if (isEmpty()) {
			throw new RuntimeException("Kya deekh rha hain?");
		}

		Node temp = head;
		head = head.next;
		return temp.data;
	}

	public OO removeAt(int idx) {
		if (idx == 0) {
			return removeFirst();
		}
		if (idx == size() - 1) {
			return removeLast();
		}
		if (idx < 0 || idx >= size()) {
			throw new RuntimeException("Kya deekh rha hain?");
		}
		Node prev = getNodeAt(idx - 1);
		Node curr = prev.next;
		Node after = curr.next;
		prev.next = after;
		return curr.data;
	}

}
