package Lec_Q_LL;

public class LinkedList {
	class Node {
		public Node(int ali) {
			// TODO Auto-generated constructor stub
			data = ali;
		}

		int data;
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

	public int getFirst() {
		if (isEmpty()) {
			throw new RuntimeException("Kya deekh rha hain?");
		}
		return head.data;
	}

	public int getLast() {
		if (isEmpty()) {
			throw new RuntimeException("Kya deekh rha hain?");
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}

	public int getAt(int idx) {
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

	public void addFirst(int ali) {
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
	public void add(int ali) {
		addLast(ali);
	}
	public void addLast(int ali) {
		if (isEmpty()) {
			addFirst(ali);
			return;
		}
		Node last = getNodeAt(size() - 1);
		Node nn = new Node(ali);
		last.next = nn;
	}

	public void addAt(int ali, int idx) {
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

	public int removeLast() {
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

	public int removeFirst() {
		if (isEmpty()) {
			throw new RuntimeException("Kya deekh rha hain?");
		}

		Node temp = head;
		head = head.next;
		return temp.data;
	}

	public int removeAt(int idx) {
		if(idx==0) {
			return removeFirst();
		}
		if(idx==size()-1) {
			return removeLast();
		}
		if(idx<0||idx>=size()) {
			throw new RuntimeException("Kya deekh rha hain?");
		}
		Node prev = getNodeAt(idx-1);
		Node curr = prev.next;
		Node after = curr.next;
		prev.next = after;
		return curr.data;
	}
	public void reverse() {
		Node curr = head;
		Node prev = null;
		while(curr!=null) {
			Node after = curr.next;
			curr.next = prev;
			
			prev = curr;
			curr = after;
		}
		head = prev;
	}
	public void rev2() {
		rev2(head);
	}

	private Node rev2(Node nn) {
		if(nn.next ==null) {
			head = nn;
			return nn;
		}
		Node Tail = rev2(nn.next);
		Tail.next = nn;
		nn.next = null;
		return nn;
		
	}

}
