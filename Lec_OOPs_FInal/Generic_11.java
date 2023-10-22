package Lec_OOPs_FInal;

import java.util.Comparator;

public class Generic_11 {
	public static void main(String[] args) {
		Student[] arr = new Student[5];
		arr[0] = new Student("Halkat", 10);
		arr[1] = new Student("Chucha", 15);
		arr[2] = new Student("Bhoola", 72);
		arr[3] = new Student("Chaman", 5);
		arr[4] = new Student("Babu Rao", 57);
		print(arr);
		sort(arr);
		sort(arr, new Namecom());
		print(arr);
	}
	static class Namecom implements Comparator<Student>{

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return o1.Name.compareTo(o2.Name);
		}
		
	}
	public static <pui> void print(pui[] arr) {
		for (pui alo : arr) {
//			alo.
			System.out.print(alo + " ");
		}
		System.out.println();
	}
//	public static void print(Object[] arr) {
//		for (Object alo : arr) {
//			System.out.print(alo + " ");
//		}
//		System.out.println();
//	}

	public static<Pu extends Comparable<Pu>> void sort(Pu[] arr) {
		for (int cn = 1; cn < arr.length; cn++) {
			for (int i = 0; i < arr.length - 1; i++) {
//			left i, right i+1'
//				if (arr[i].Age - arr[i + 1].Age > 0) {
				if(arr[i].compareTo(arr[i+1])>0) {
					Pu temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}
	public static<Pu> void sort(Pu[] arr, Comparator<Pu> com) {
		for (int cn = 1; cn < arr.length; cn++) {
			for (int i = 0; i < arr.length - 1; i++) {
//			left i, right i+1'
//				if (arr[i].Age - arr[i + 1].Age > 0) {
				if(com.compare(arr[i],arr[i+1])>0) {
					Pu temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}
}
