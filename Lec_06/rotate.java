package Lec_06;

public class rotate {
	public static void main(String[] args) {
		int num = 12345;
		int rot = 360003;

		int baaaackup = num;
		int nod = 0;
		while (num > 0) {
			num = num / 10;
			nod++;
		}

		num = baaaackup;
		System.out.println(nod);
		rot = rot % nod;

		for (int count = 1; count <= rot; count++) {
			int digit = num % 10;
			int remain = num / 10;

			System.out.println(digit + " - " + remain);

			int mult = (int) Math.pow(10, 4);
			num = digit * mult + remain;
			System.out.println(num);
		}
	}
}
