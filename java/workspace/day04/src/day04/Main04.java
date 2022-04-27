package day04;

public class Main04 {
	public static void main(String[] args) {
		//do~while문
		
		int sum = 0;
		
		//초기식
		int i = 1;
		
		do {
			sum += i;
			i++;
		}while(i <= 100);
		System.out.println(sum);
	
}
}