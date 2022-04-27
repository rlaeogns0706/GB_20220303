package test2_1;

public class Test4 {
	public static void main(String[] args) {

		// 4번문제 최대값
		int[] num = { 94, 85, 95, 88, 90 };

		int max = 0;

		for (int i = 0; i < num.length; i++) {
			if(max < num[i]) {
				max = num[i];
			}
		}
		System.out.println("최대값 : " + max);
	}
}
