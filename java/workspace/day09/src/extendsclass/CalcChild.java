package extendsclass;

//CalcParent를 상속받는 클래스
//부모의 모든 기능 상속
//곱셈 나눗셈 추가로 부모의 기능 확장
public class CalcChild extends CalcParent {

	public int times(int x, int y) {
		return x * y;

	}

	public int divide(int x, int y) {
		int result = 0;
		if (y != 0) {
			result = x / y;
		}
		return result;
	}
}
