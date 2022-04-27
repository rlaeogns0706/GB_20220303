package test2_1;

public class Test2 {
	public static void main(String[] args) {
		// 2번문제
		int i = 0;
		int j = 0;
		int total = 0;
		int average = 0;
		int[][] arr = {

				{ 5, 5, 5, 5, 5 },

				{ 10, 10, 10, 10, 10 },

				{ 20, 20, 20, 20, 20 },

				{ 30, 30, 30, 30, 30 } };
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
//				System.out.print(i);
//				System.out.print(j);
//				System.out.println();
			}

		}
		average = total / (i * j);

		System.out.println(total);
		System.out.println(average);

	}
}
