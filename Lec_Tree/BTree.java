package Lec_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BTree {
	class Node {
		public Node(int i) {
			// TODO Auto-generated constructor stub
			data = i;
		}

		int data;
		Node left;
		Node right;
	}

	Node root;

	public void print() {

		print(root);
	}

	private void print(Node nn) {
		if (nn == null) {
			return;
		}
		String str = "";
		if (nn.left != null) {
			str = str + nn.left.data;
		}
		str = str + "=>" + nn.data + "<=";
		if (nn.right != null) {
			str = str + nn.right.data;
		}
		System.out.println(str); // S
		print(nn.left); // L
		print(nn.right); // R

	}

	public BTree(int[] pre, int[] in) {
		root = createP_IN(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}

	private Node createP_IN(int[] pre, int ps, int pe, int[] in, int is, int ie) {
		if (ps > pe || is > ie) {
			return null;
		}
		Node nn = new Node(pre[ps]);
		int f = -1;
		int L_s = 0;
		for (int i = is; i <= ie; i++) {
			if (in[i] == pre[ps]) {
				f = i;
				break;
			}
			L_s++;
		}

		nn.left = createP_IN(pre, ps + 1, ps + L_s, in, is, f - 1);
		nn.right = createP_IN(pre, ps + L_s + 1, pe, in, f + 1, ie);
		return nn;
	}

	public int size() {
		return size(root);
	}

	private int size(Node nn) {
		if (nn == null) {
			return 0;
		}
		int L = size(nn.left);
		int R = size(nn.right);

		return L + R + 1;
	}

	public int Ht() {
		return Ht(root);
	}

	int MAX_DIA = 0;

	private int Ht(Node nn) {
		if (nn == null) {
			return -1;
		}
		int L = Ht(nn.left);
		int R = Ht(nn.right);
		MAX_DIA = Math.max(MAX_DIA, L + R + 2);
		return Math.max(L, R) + 1;
	}

	public int Dia() {
		return Dia(root);
	}

	private int Dia(Node nn) {
		if (nn == null) {
			return 0;
		}
		int self = Ht(nn.left) + Ht(nn.right) + 2;
		int L = Dia(nn.left);
		int R = Dia(nn.right);

		return Math.max(Math.max(L, R), self);
	}

	class DiaHtP {
		int Dia = 0;
		int Ht = -1;
	}

	private DiaHtP Dia2(Node nn) {
		if (nn == null) {
			return new DiaHtP();
		}
		DiaHtP L = Dia2(nn.left);
		DiaHtP R = Dia2(nn.right);

		int self = L.Ht + R.Ht + 2;

		DiaHtP ans = new DiaHtP();
		ans.Ht = Math.max(L.Ht, R.Ht) + 1;
		ans.Dia = Math.max(self, Math.max(L.Dia, R.Dia));
		return ans;
	}

	public boolean isBal() {
//		return isBal(root);
		return isBal2(root).B;
	}

	class BalHtP {
		int Ht = -1;
		boolean B = true;
	}

	private boolean isBal(Node nn) {
		if (nn == null) {
			return true;
		}
		boolean L = isBal(nn.left);
		boolean R = isBal(nn.right);
		boolean self = Math.abs(Ht(nn.left) - Ht(nn.right)) <= 1;

		return L && R && self;
	}

	private BalHtP isBal2(Node nn) {
		if (nn == null) {
			return new BalHtP();
		}
		BalHtP L = isBal2(nn.left);
		BalHtP R = isBal2(nn.right);

		BalHtP ans = new BalHtP();

		ans.Ht = Math.max(L.Ht, R.Ht) + 1;

		boolean self = Math.abs(L.Ht - R.Ht) <= 1;

		ans.B = L.B && R.B && self;
		return ans;
	}

	public void BFS() {
//		BFT// Level Order!!
		Queue<Node> Q = new LinkedList<>();
		Q.add(root);
		while (!Q.isEmpty()) {
			Node curr = Q.poll();
			System.out.println(curr.data);
			if (curr.left != null) {
				Q.add(curr.left);
			}
			if (curr.right != null) {
				Q.add(curr.right);
			}

		}
	}

	public void BFS1() {
//		BFT// Level Order!!
		Queue<Node> cQ = new LinkedList<>();
		Queue<Node> nQ = new LinkedList<>();

		cQ.add(root);
		while (!cQ.isEmpty()) {
			Node curr = cQ.poll();
			System.out.print(curr.data + " - ");
			if (curr.left != null) {
				nQ.add(curr.left);
			}
			if (curr.right != null) {
				nQ.add(curr.right);
			}
			if (cQ.isEmpty()) {
				System.out.println();
				cQ = nQ;
				nQ = new LinkedList();
			}
		}
	}

	public void BFS2() {
//		BFT// Level Order!!
		Queue<Node> Q = new LinkedList<>();

		Q.add(root);
		int curr_size = Q.size();
		while (!Q.isEmpty()) {
			for (int i = 0; i < curr_size; i++) {
				Node curr = Q.poll();
				System.out.print(curr.data + " - ");
				if (curr.left != null) {
					Q.add(curr.left);
				}
				if (curr.right != null) {
					Q.add(curr.right);
				}
			}
//			current lvl is finished
			curr_size = Q.size();
			System.out.println();
		}
	}

	public BTree(int[] lvl) {
		root = new Node(lvl[0]);
		Queue<Node> Q = new LinkedList<>();
		Q.add(root);
		int idx = 1;
		while (!Q.isEmpty() && idx < lvl.length) {
			Node nn = Q.poll();
//			System.out.println(nn.data+"-");
			if (idx < lvl.length && lvl[idx] != -1) {
				nn.left = new Node(lvl[idx]);
				Q.add(nn.left);
			}
			idx++;
			if (idx < lvl.length && lvl[idx] != -1) {
				nn.right = new Node(lvl[idx]);
				Q.add(nn.right);
			}
			idx++;

		}

	}

	int p_idx = 0;

	public BTree(int[] pre, boolean b) {
		p_idx = 0;
		root = createPre(pre);
	}

	private Node createPre(int[] pre) {
		if (p_idx >= pre.length || pre[p_idx] == -1) {
			p_idx++;
			return null;
		}
		Node nn = new Node(pre[p_idx]);
		p_idx++;
		nn.left = createPre(pre);
		nn.right = createPre(pre);
		return nn;
	}

	public boolean isBST() {
		return isBST(root);
	}

	private boolean isBST(Node nn) {
		if (nn == null) {
			return true;
		}
		boolean L = isBST(nn.left);
		boolean R = isBST(nn.right);
		boolean self = Max(nn.left) <= nn.data && nn.data < Min(nn.right);
		return L && R && self;
	}
	
}
