package Lec_OOPs_FInal;

public class Student implements Comparable<Student> {
//	Data Parsing., Data members!!
	static int total_num_student = 10;
	int Age = 0;
	String Name = "chotu";

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{" + Name + "," + Age + "}";
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) throws Exception {
		if (age < 0) {
//			pheeko exception!!
//			throw new RuntimeException("bhai mere mat kar"); // unchecked
			throw new Exception("bhai mere mat kar"); // checked

		}

		this.Age = age;

	}

	public Student() {
		this("bhuuula", 49);

	}

	public Student(String str, int A) {
		Student.total_num_student++;
		Name = str;
		Age = A;
	}

	public Student(String Naaaam) {
		Name = Naaaam;
	}

	public Student(int Age) {
		this.Age = Age;
	}

	public void Intro() {
		System.out.println("this walaaa" + this);
		System.out.println(this.Name + " my age is " + this.Age);
	}

	public void party(String Name) {
		System.out.println(Name + " party with " + this.Name);
	}

	@Override
	public int compareTo(Student o) {
//		A.compare(B)
//		this = A;
//		o= B;

		return this.Age - o.Age;
	}
}
