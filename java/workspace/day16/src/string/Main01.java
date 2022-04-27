package string;

public class Main01 {
	public static void main(String[] args) {
		//이메일 주소에서 아이디와 도메인을 구별하기
		
		//이메일 주소 정의
		//split 사용 금지
		String email = "student@java.com";
		// @위치
		int email_pos = email.indexOf("@");
		//도메인
		String sub_email = email.substring(email_pos + 1);
		//아이디
		String sub_email2 = email.substring(0,email_pos	);
		System.out.println(sub_email);
		System.out.println(sub_email2);
		
		
	}
}
