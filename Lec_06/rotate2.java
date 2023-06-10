package Lec_06;

public class rotate2 {
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

		rot = rot % nod;

		int div = (int) Math.pow(10, rot);
		int part1 = num / div;
		int part2 = num % div;
		System.out.println(part1 + " - " + part2);
//		System.out.println(part2+""+part1);
//		
//		int mult = (int) Math.pow(10, nod - rot);
//		int ans = part2 * mult + part1;
//		System.out.println(ans);

	}
}
