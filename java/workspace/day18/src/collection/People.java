package collection;

public class People {
	private String mem;
	private String phoneNum;
	//생성자
	public People(String mem, String phoneNum) {
		super();
		this.mem = mem;
		this.phoneNum = phoneNum;
	}
	public String getMem() {
		return mem;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	@Override
	public String toString() {
		return "People [mem=" + mem + ", phoneNum=" + phoneNum + "]";
	}
	
	
}
