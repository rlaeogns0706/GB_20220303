package test1;

public class Test2 {
	public static void main(String[] args) {
		
		int sum= 0;
		int result = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
			result += sum;
		}
		System.out.println(result);
		int x =15;
		
		System.out.println(x>10 && x<20);
		int year;
		year=3;
		System.out.println((year%400==0)||(year%4==0)&&(year%100 !=0));
		boolean powerOn = false;
		System.out.println(powerOn != true);
	}
	
}
