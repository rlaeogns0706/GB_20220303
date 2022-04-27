package test0330_2;

public class Main {
	public static void main(String[] args) {
		//Student 클래스 객체 생성
		
		Student st = new Student("대훈", 7, 1, 80, 80, 80);
		
		//Student 클래스의 총합, 평균값을 출력하는 메서드 호출(10)
		System.out.println(st.plus());
		System.out.println(st.average());
		//Student 클래스의 name, ban, no, kor, eng, math 를 출력하는 메서드 호
		st.print();
	}
}
