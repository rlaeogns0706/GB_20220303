package boxing;

class Hello {
	public void say() {
		System.out.println("Hello");
	}

}

class Korean extends Hello {
	@Override
	public void say() {
		System.out.println("안녕하세여");
	}

	public void talk() {
		System.out.println("또만낫군요");
	}
}

public class Main01 {
	public static void main(String[] args) {

		Hello Hi = new Korean();
		Hi.say();
	//	Hi.talk(); Hello 클래스에 정의된 기능이 아니라서 에러 (부모한테 물려받은 기능만 사용 가능)
		
		
		
		
	}
}
