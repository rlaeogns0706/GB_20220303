package test2_1;

public class Test5 {
	public static void main(String[] args) {
		// 5번 홀짝의 합
		int[] num = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int odd = 0;
		int even = 0;
		for (int i = 0; i < num.length; i++) {
			if(num[i]%2 == 0) {
				//even
				even += num[i];
			}else {
				//odd
				odd += num[i];
			}
		}

		System.out.println("짝수 : " + even);
		System.out.println("홀수 : " + odd);
		
	}
}
