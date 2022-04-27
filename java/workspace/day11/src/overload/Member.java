package overload;

public class Member {
	private String job;
	private int age;

	// 기본 생성자
	Member() {
		
	}

	// age를 param 값으로 받아오는 생성자
	Member(int age) {
		this.age = age;
	}

	// job 을 param 로 받아오는 생성자
	Member(String job) {
		this.job = job;
	}

	// job과 age를 파라미터로 생성자
	Member(String job,int age) {
		this.job = job;
		this.age =age;
	}
	Member(int age,String job) {
		this.job = job;
		this.age =age;
	}

	// 클래스명, job , age 출력 toString()
	public String toString(){
		return "Member : [직업: " + job + ",나이 : " + age + "]";
	}
	// main클래스에 객체생성 각 한 후 출력
}
