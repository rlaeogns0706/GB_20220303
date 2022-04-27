package pattern;

public class Main02 {
	public static void main(String[] args) {
		String name = "자바학생";
	if(!RegexHelper.getInstance().isKor(name)) {
		System.out.println("이름은 한글로");
		return;
	}
	}
}

