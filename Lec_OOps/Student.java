package Lec_OOps;

public class Student {
//	Data Parsing., Data members!!
	int Age = 0;
	String Name = "chotu";

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
