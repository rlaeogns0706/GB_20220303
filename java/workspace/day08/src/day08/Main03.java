package day08;

class Book{
	String subject;
	String content;
	
	Book(){
		System.out.println("생성자 호출");
		this.subject = "java입문";
		this.content = "자바어쩌구";
		
	}
}
//생성자 -> 객체가 생성될 때, 자동으로 실행되는 툭수한 메서드
//특징 -> 리턴형 명시 x 클래스와 이름 동일

public class Main03 {
		public static void main(String[] args) {
			Book book = new Book();
		
		
		
		}
}
