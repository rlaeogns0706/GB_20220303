package day08;

class Student{
	int age;
	 
	public String getName() {
		String name = " 자바 학생 ";
		return name;
	}
	
	public void sayname() {
		String myname = this.getName();
		System.out.println(myname);
	}
}

public class Main {
	public static void main(String[] args) {
		Student std = new Student();
		std.sayname();
	}
}
