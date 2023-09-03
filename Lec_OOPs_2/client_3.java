package Lec_OOPs_2;

public class client_3 {
	public static void main(String[] args) {

		Student s = new Student("Chottu", 12);
		try {
			s.setAge(13);
			System.out.println(s.getAge());
			s.setAge(20);
			System.out.println(s.getAge());
			System.out.println("try END");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally done");
		}
		System.out.println("LOLO");
	}
}
