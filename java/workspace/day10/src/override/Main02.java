package override;

class HelloP {
	public void say() {
		System.out.println("Hello");
	}
}

class KoreanC extends HelloP {
	public void say() {
		super.say();
		System.out.println("안녕하세요");
	}
}

public class Main02 {
	public static void main(String[] args) {
		KoreanC k = new KoreanC();
		k.say();
	}
}
