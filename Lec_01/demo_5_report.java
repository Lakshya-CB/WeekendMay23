package Lec_01;

public class demo_5_report {
	public static void main(String[] args) {
		int marks = 42;
		if (marks >= 90) {
			System.out.println("A");
		} else if (marks >= 50 && marks < 60) {
			System.out.println("E");
		} else if (marks >= 60 && marks < 70) {
			System.out.println("D");
		} else if (marks >= 70 && marks < 80) {
			System.out.println("C");
		} else if (marks >= 80 && marks < 90) {
			System.out.println("B");
		} else {
			System.out.println("F");
		}
	}
}
