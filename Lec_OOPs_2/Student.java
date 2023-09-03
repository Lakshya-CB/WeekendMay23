package Lec_OOPs_2;

public class Student {
//	Data Parsing., Data members!!
	private int Age = 0;
	private String Name = "chotu";

	public int getAge() {
		return Age;
	}

	public void setAge(int age) throws Exception {
		if(age<0) {
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
}
