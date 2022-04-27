package day08;

class Article{
	int seq;		//글 번호
	String subject; // 글 제목
	String writer;  //작성자
	
	
	
	//파라미터가 존재하는 생성자 모든 전역변수를 초기화
	Article(int seq, String subject, String writer){
		this.seq = seq;
		this.subject = subject;
		this.writer = writer;
	}
	
	//메서드 전역변수 각각을 출력하는 메서드 작성
	public void say() {
		System.out.println(seq);
		System.out.println(subject);
		System.out.println(writer);
		System.out.println();
	}
}

public class Main05 {
	public static void main(String[] args) {
		// 클래스 객체 1번 생성
		// 객체.메서드 출력메서드 호출
		Article Ar1 = new Article(1, "제목1", "rlaeogns");
		Ar1.say();
		
		// 클래스 2번 생성
		//객체.메서드 출력메서드 호출
		Article Ar2 = new Article(2, "제목2", "김대훈");
		Ar2.say();
	}
}
