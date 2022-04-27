package object;


class StudentUser{
	String name;
	
	public void setName(String name) {
		this.name = name;
		
	}
	
	public String getName() {
		return this.name;
		
	}
	
}


public class Main02 {

		public static void main(String[] args) {
			//클래스 사용해서 객체 생성 후 메서드 사용 전역변수 name에 자바 학생 출력
			StudentUser u1 = new StudentUser();
			u1.setName("자바 학생");
			System.out.println(u1.getName());
			
			
			
			
			
			
		}
}
