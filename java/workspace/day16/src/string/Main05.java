package string;

/*
 * D:/photo/2022/travel/food.jpg 라는 파일
 * 이 파일의 경로는 data라고 하는 객체로 생성 출력
 * (split() x)

 * ---------------------------------------
 * 파일이름	:food
 * 확장자		:jpg
 * 폴더명		:D:/photo/2022/travel
 * 
 */
public class Main05 {
	public static void main(String[] args) {

		String data = "D:/photo/2022/travel/food.jpg";

		// 파일이름 추출
		String name = data.substring(data.lastIndexOf("/") + 1, data.lastIndexOf("."));
		System.out.println("파일이름 = " + name);

		// 확장자 추출
		String ext = data.substring(data.lastIndexOf(".") + 1);
		System.out.println("확장자 = " + ext);

		// 소스파일 폴더이름 추출
		System.out.println
			("폴더명 = " + data.substring(0, data.lastIndexOf("/")));

	}
}
