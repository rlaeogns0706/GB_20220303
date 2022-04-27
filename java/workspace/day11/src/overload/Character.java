package overload;

public class Character {
	private String job;
	private int age;

	public void setProperty(String job) {
		this.job = job;
	}

	public void setProperty(int age) {
		this.age = age;

	}

	public void setProperty(String job, int age) {
		this.job = job;
		this.age = age;

	}

	public void setProperty(int age, String job) {
		this.job = job;
		this.age = age;
	}

	public String toString() {
		return "Character[ job = " + job + " ,age = " + age + "]";
	}
}
