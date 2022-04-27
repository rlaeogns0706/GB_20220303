package day08;

class StudentJava{
	String name;
	int age;
	
	public StudentJava(String name, int age) {
		//생성자 파라미터의 값을 멤버변수에 복사
		this.name = name;
		this.age =age;
	}
}

public class Main04 {
		public static void main(String[] args) {
			//생성자에 파라미터를 넣었기 때문에 생성할 때 파라미터를 넣어줘야함
			StudentJava stdJava = new StudentJava("rlaeogns", 20);
			
			
			
			
			
			
		}

}
