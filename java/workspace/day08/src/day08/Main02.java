package day08;

import java.lang.reflect.Member;

class Memeber{
	String name;
	int age;
	
	//getName() , return, 전역변수 name
	public String getName() {
		
		return name;
	}
	//setName(), param name, 전역변수 name = param name
	public void setName(String name) {
		this.name = name;
	}
	//getAge(), return, 전역변수 age
	public int getAge() {
		
		return age;
	}
	//setAge(), param age, 전역변수 age = param age
	public void setAge(int age) {
		this.age = age;
		
	}
	//say(), getName(),getAge() 각각 출력
	public void say() {
		System.out.println(getName());
		System.out.println(getAge());
	}
}

public class Main02 {
	public static void main(String[] args) {
		//Member class 객체 생성
		Memeber Mb = new Memeber();
		
		//메서드를 사용해서 전역변수 name, age에 값을 할당시킨다
		
		Mb.setName("rlaeogns");
		Mb.setAge(20);
		
		//say() 메서드 호출해서 출력
		
		Mb.say();
	}
}
