package Lec_Tree;

public class BTree_demo {
	public static void main(String[] args) {
		int[] pre = { 10, 20, 40, 50, 30, 60 };
		int[] in = { 40, 20, 50, 10, 30, 60 };
		BTree BT = new BTree(pre, in);
		BT.print();
		BT.BFS2();
		System.out.println("=====");
		int[] lvl = {10,20,30,40,50,-1,60,-1,-1,-1,-1,70};
		BTree BT1 = new BTree(lvl);
		BT1.print();
//		BT1.BFS2();
	}
}
