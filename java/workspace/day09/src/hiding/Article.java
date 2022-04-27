package hiding;

public class Article {

	private int seq; 	//글번호
	private String subject; //글제목
	private String content; //글내용
	private String writer; //작성자
	private int hit;	  //조회수
	private String regDate; // 작성일자
	
	
	//파라미터가 있는 생성자
	Article(int seq, String subject, String content, String writer
			, int hit, String regDate){
		this.seq = seq;
		this.content =content;
		this.hit = hit;
		this.regDate = regDate;
		this.writer = writer;
				
	}


	public int getSeq() {
		return seq;
	}


	public void setSeq(int seq) {
		this.seq = seq;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}


	public int getHit() {
		return hit;
	}


	public void setHit(int hit) {
		this.hit = hit;
	}


	public String getRegDate() {
		return regDate;
	}


	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	
	//getter setter 추가
	
	//main메서드를 포함하고있는 클래스에서 객체생성, 항목 출력
	
}
