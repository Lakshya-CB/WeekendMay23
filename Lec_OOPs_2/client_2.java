package Lec_OOPs_2;

public class client_2 {
	public static void main(String[] args) {
		Student s = new Student("Chottu", 12);

		try {
			s.setAge(13);
			System.out.println(s.getAge());
			s.setAge(-20);
			System.out.println(s.getAge());
			System.out.println("try END");
		} catch (Exception pui) {
			System.out.println("milgaya exception!!");
//			pui.printStackTrace();
			System.out.println("~~~~" + pui.getMessage());
		}
		System.out.println("LOLO");
		int I = 10;
		System.out.println(I + 2);
	}

}
