package hiding;

public class Main02 {
	public static void main(String[] args) {
		// member 클래스 객체생성
		Member mb = new Member("rlaeogns",20);
		
		// name, age 가각 출력
		System.out.println(mb.getName());
		System.out.println(mb.getAge());
		
	}
}
