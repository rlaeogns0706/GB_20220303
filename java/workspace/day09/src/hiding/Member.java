package hiding;

public class Member {
	private String name;
	private int age;
	Member(String name, int age){
		this.name = name;
		this.age = age;
	}
	/*
	 * parma name, age 생성자
	 * 전역변수.name = name 전역변수.age = age
	 * 
	 * 
	 * name, age 전역변수의 getter setter 생성
	 * 
	 */
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
