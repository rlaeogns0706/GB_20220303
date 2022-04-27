package day03;

import java.util.Scanner;

public class Main03 {
	public static void main(String[] args) {

		// 만약 3000언 이상의 돈을 가지고 있으면 택시를 타고 그렇지 않으면 걸어가라
		int money = 3000;
		if (money == 3000) {
			System.out.println("택시를 탑니다");
		}
		System.out.println("걸어갑니다");
		// 만약 돈이 3000원 이상 있거나, 카드가 있다면 택시를 타고 그렇지 않으면 걸어가라
		int money1;
		int card;
		Scanner sc = new Scanner(System.in);
		System.out.println("가진 돈을 입력하세요");
		money1 = sc.nextInt();
		System.out.println("카드를 가지고 계십니까?\n 1.있다 2.없다");
		card = sc.nextInt();
		if (money1 >= 3000) {
			System.out.println("택시를 타고 갑니다");
		}else if(card ==1) {
			System.out.println("택시를 타고 갑니다");
		}else {
			System.out.println("걸어서 갑니다");
		}
		
		// 어떤 특정 정수값 a가 짝수이면 "짝수" 홀수이면 "홀수"를 출력하라
		int a = 10;
		;
		if (a % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		// 특정 정수값 a2,b2,c2의 최대값을 구하여라
		int a2 = 10, b2 = 20, c2 = 9;

		// 국 ㅕㅇㅇ수 평균이 95 이상이면 장학생 출력
		// 국어점수 70 이상이면 국어 합격 아니면 불합격 출력
		// 수학점수 90 이상이면 A 80 이상이면 B 70 이상이면 C
		// 60이상이면 D 나머지 F 출력

	}
}
