package string;

public class Main02 {
	public static void main(String[] args) {
		/*
		 * 주민등록번호에서 생년월일 추출 - 8005011234567 -> 1980년 05월01일 남자 1, 2 : 19~ / 3,4 : 20~
		 * 1,3 : 남자 / 2,4 : 여자
		 * 
		 */
		String num = "0107064222411";
		String yy = num.substring(0, 2);
		String mm = num.substring(2, 4);
		String dd = num.substring(4, 6);
		switch (num.charAt(6)) {
		case ('1'):
			System.out.println("19" + yy + "년 " + mm + "월" + dd + "일" + "남자");

		case ('2'):
			System.out.println("19" + yy + "년 " + mm + "월" + dd + "일" + "여자");

		case ('3'):
			System.out.println("20" + yy + "년 " + mm + "월" + dd + "일" + "남자");

		case ('4'):
			System.out.println("20" + yy + "년 " + mm + "월" + dd + "일" + "여자");

		}

		String jumin = "8005011234567";

		// 주민번호를 년,월,일 단위로 두글자 씩 자르기
		String yy1 = num.substring(0, 2);
		String mm1 = num.substring(2, 4);
		String dd1 = num.substring(4, 6);
		// 뒷부분의 첫글자를 성별코드이므로 별도로 추출
		String gender_code = jumin.substring(6, 7);

		// 태어난 년도의 판별
		if (gender_code.equals("1") || gender_code.equals("2")) {
			yy = "19" + yy;

		} else {
			yy = "20" + yy;
		}
		// 성별
		String gender = "남자";
		// 뒷부분 첫글자 2,4인 경ㅇ 여자
		if (gender_code.equals("2") || gender_code.equals("4")) {
			gender = "여자";
		}
		//형식에 맞춘 내용 출력
		System.out.printf("%s년%s월%s일%s",yy,mm,dd,gender);
	}
}
