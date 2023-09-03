package Lec_OOPs_2;

public class client_4_finallhy {
	public static void main(String[] args) {
//		LL();
		System.out.println(jaadu());
	}

	public static void LL() {
		try {
			if (1 < 2) {
				System.out.println("sf");
				return;
			}
		} finally {
			System.out.println("jaadu");
		}
		System.out.println("koi mil gya!");
	}
	
	public static int jaadu() {
		try {
//			System.exit(0);
			System.out.println("naacho!");
//			recursion();
			return 1;
		}finally {
			return 10;
		}
	}
}
