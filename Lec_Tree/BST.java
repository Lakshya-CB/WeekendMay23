package Lec_Tree;

import Lec_Tree.BTree.Node;

public class BST {
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

	public void add(int ali) {
		root = add(root, ali);
	}

	private Node add(Node nn, int ali) {
		if (nn == null) {
			return new Node(ali);
		}
		if (ali > nn.data) {
			nn.right = add(nn.right, ali);
		} else {
			nn.left = add(nn.left, ali);
		}
		return nn;
	}

	public void remove(int ali) {
		root = remove(root, ali);
	}

	private Node remove(Node nn, int ali) {
		if (ali > nn.data) {
			nn.right = remove(nn.right, ali);
		} else if (ali < nn.data) {
			nn.left = remove(nn.left, ali);
		} else {
//			C1!! 0 child
			if (nn.left == null && nn.right == null) {
				return null;
			}
//			C2!! 1 child
			if (nn.left != null && nn.right == null) {
				return nn.left;
			}
			if (nn.left == null && nn.right != null) {
				return nn.right;
			}
//			c3!!
			nn.data = Max(nn.left);
			nn.left = remove(nn.left, nn.data);
		}
		return nn;
	}

}
