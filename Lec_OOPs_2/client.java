package Lec_OOPs_2;

public class client {
	public static void main(String[] args) throws Exception {
		Student s1 = new Student("Ajay",10);
//		s1.Age = -10;
//		s1.Age = 10;
		System.out.println(s1.getAge());
		s1.setAge(15);
		System.out.println(s1.getAge());
		s1.setAge(-15);
		System.out.println(s1.getAge());
		System.out.println("bye bye");
	}
}
