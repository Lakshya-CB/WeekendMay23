package Lec_16;

public class Genrate_parent {
	public static void main(String[] args) {
		lagade(2, 2, "");
	}

	public static void lagade(int op, int cl, String str) {
		if (op == 0 && cl == 0) {
			System.out.println(str);
			return;
		}
		if(op>cl) {
			return;
		}
		if (op > 0) {
			lagade(op - 1, cl, str + "(");
		}
		if (cl > 0) {
			lagade(op, cl - 1, str + ")");
		}
	}
}
