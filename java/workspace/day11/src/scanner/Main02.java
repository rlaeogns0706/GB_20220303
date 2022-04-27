package scanner;

import java.util.Scanner;

public class Main02 {
	public static void main(String[] args) {
		/*
		 * scanner.next()		공백 전 까지 입력받음
		 * scanner.nextLine()	한줄 전체를 입력받음
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력1: ");
		String str1 = sc.nextLine();
		System.out.println( str1 );
		
		System.out.print("문자열 입력2: ");
		String str2 = sc.next();
		System.out.println( str2 );
		
		
		
		
		
		
		sc.close();
	}
}
