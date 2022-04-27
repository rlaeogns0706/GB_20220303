package exception;

public class Main05 {
	public static void main(String[] args) {
		//사용자의 입력값을 가정
		String[] src = {"7","2","8","4"};
		
		//src의 내용들을 숫자로 변환해서 저장할 배열
		int[] arr = new int[3];
		
		try {
		for(int i = 0; i<src.length; i++) {
			arr[i] = Integer.parseInt(src[i]);
			System.out.println(arr[i]);
		}
		}
		catch(NumberFormatException e) {
			System.out.println("입력값 오휴");
			//개발자가 보려는 용도
			e.printStackTrace();
		} 
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("데이터 많음");
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("알수 없는 에러");
			e.printStackTrace();
		}
		
		
		System.out.println("----------end----------");
		
		
	}
}
