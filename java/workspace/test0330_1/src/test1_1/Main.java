package test1_1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 2개의 정수를 입력받는다
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 x 입력:");
		int x = sc.nextInt();
		System.out.print("정수 y 입력:");
		int y = sc.nextInt();

		// 입력받은 정수를 각각 출력한다
		System.out.println("입력받은 정수는 " + x + "," + y + " 입니다");

		// Calc 객체 생성 본인의 이름을 매개변수값으로 넘긴다
		Calc c = new Calc("김대훈");

		// 본인의 이름 출력한다
		System.out.println(c.getStr());

		// Calc 사용 puls minus 사칙연산 결과 출력
		System.out.println(c.plus(x, y));
		System.out.println(c.minus(x, y));
		
		//Calc 사용 times divide 사칙연산 결과 출력
		System.out.println(c.times(x, y));
		System.out.println(c.divide(x, y));
		

	}

}
