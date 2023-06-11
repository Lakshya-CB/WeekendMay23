package Lec_07;

public class armstrooonf {
	public static void main(String[] args) {
		int n = 10000;
		printAllArmTill(n);
	}

	public static void printAllArmTill(int n) {
		for (int num = 1; num <= n; num++) {
			if (isArm(num)) {
				System.out.println(num);
			}
		}

	}

	public static boolean isArm(int num) {
//		370
		int sum = 0;
		int nod = nod(num);
		int baaackup = num;
		while (num > 0) {
			int digit = num % 10;
			sum = sum + (int) Math.pow(digit, nod);
			num = num / 10;
		}
		if (sum == baaackup) {
			return true;
		} else {
			return false;
		}
	}

	public static int nod(int num) {
		int ans = 0;
		while (num > 0) {
			num = num / 10;
			ans++;
		}
		return ans;
	}

}
