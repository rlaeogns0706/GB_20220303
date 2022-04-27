package hiding;

public class StudentJava2 {
	//은닉된 멤버변수 -> 현재 블록 안에서만 접근 가능
	
	private String name;
	private int age;
	
	//getter 메서드 2개
	public int getterAge() {
		return age;
	}
	public String getterName() {
		return name;
	}
	//setter 메서드 2개
	public void setterAge(int age){
		this.age = age;
	}
	
	public void setterName(String name) {
		this.name = name;
		
	}
}
