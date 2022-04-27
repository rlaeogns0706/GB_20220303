package override;

class PClass2 {
	public PClass2(String str) {
		System.out.println("부모 생성자 호출 " + str );
	}
}

class CClass2 extends PClass2 {
	public CClass2() {
		super("부모 생성자");
		System.out.println("자식 생성자 호출");
	}
}
/*
 * 부모클래스의 생성자는 상속되지 않고 자식클래스로 객체를 생성할 때 
 * 자동적으로 부모의 기본 생성자를 호출
 * 부모 생성자가 매개변수를 갖고있다면 자식 클래스를 객체화 할때 자동으로 호출 X
 * 따라서 자식생성자에서 명시적으로 부모 생성자를 호출해야함
 * 이게 super()
 * 자식 생성자의 첫 줄에 위치해야 한다
 * 
 * */



public class Main5 {
	public static void main(String[] args) {
		CClass2 cClass = new CClass2();

	}

}
