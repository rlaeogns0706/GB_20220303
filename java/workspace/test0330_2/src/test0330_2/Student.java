package test0330_2;

public class Student {
	private String name;
	private int ban;
	private int no;
	private int Kor;
	private int eng;
	private int math;

	// 생성자
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		Kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// setget
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getKor() {
		return Kor;
	}

	public void setKor(int kor) {
		Kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	// Kor eng math 총합
	public int plus() {
		int result = Kor + eng + math;
		return result;
	}

	// Kor eng math 평균값
	public int average() {
		int result = (Kor + eng + math) / 3;
		return result;
	}

	// name, ban, no, kor, eng, math 를 출력
	public void print() {
		System.out.println("이름 = " + getName()+"," + getBan() + "반," + getNo() + "번," + "국어점수 = " + getKor() + ",영어점수 = "
				+ getEng() + ",수학점수 = " + getMath());
	}

}
