package Lec_07;

public class gloaaabl_demo {
	static int val = 100;

	public static void main(String[] args) {
		System.out.println(gloaaabl_demo.val);
		fun(20);
	}

	public static void fun(int a) {
		int val = 20;
		System.out.println(val);
		System.out.println(gloaaabl_demo.val);
		val = val + 60;
		gloaaabl_demo.val = val + 10;
		System.out.println(val);
		System.out.println(gloaaabl_demo.val);
	}

}
