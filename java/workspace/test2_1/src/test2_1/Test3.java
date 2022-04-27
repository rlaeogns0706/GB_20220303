package test2_1;

public class Test3 {
	public static void main(String[] args) {
		// 3번문제

		// . 큰 금액의 동전을 우선적으로 거슬러 줘야한다

		int[] coinUnit = { 500, 100, 50, 10 };

		int money = 2680;
		int count = 0;

		System.out.println("money=" + money);

		for (int i = 0; i < coinUnit.length; i++) {
			count = money / coinUnit[i];
			money -= count*coinUnit[i];
			System.out.println(coinUnit[i] + " = " + count);
			//System.out.println(money+"money");

		}

	}
}
