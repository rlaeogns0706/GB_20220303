package test1_1;

public class Calc {

	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	// 생성자
	public Calc(String str) {
		this.str = str;
	}

	public int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	public int minus(int x, int y) {
		int result = x - y;
		return result;
	}
	
	public int times(int x, int y) {
		int result = x*y;
		return result;
	}

	public int divide(int x , int y) {
		int result = x/y;
		return result;
	}
}
