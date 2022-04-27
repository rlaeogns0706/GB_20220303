package test2;

public class Test1 {
	public static void main(String[] args) {

		int i = 0;
		int j = 0;
		while (i <= 10) {
			i++;
			for (j = 0; j <= i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

}
//별 1~11개