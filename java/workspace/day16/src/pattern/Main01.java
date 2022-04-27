package pattern;

import java.util.regex.Pattern;

public class Main01 {
		public static void main(String[] args) {
			String name = "자바학생1";
			String age = "22ㅇ";
			String email = "user@java.comㅁㄴㄹ";
			String phone = "0101234123ㅁㄴㅇㄹ";
			
			//한글 여부 검사
			boolean isKor = Pattern.matches("^[ㄱ-ㅎ가-힣]*$", name);
			//System.out.println(isKor);
			
			if(!isKor) {
				System.out.println("이름은 한글로 입력해 주십시오");
				return;
			}
			
			//숫자인지 검사
			boolean isnum = Pattern.matches("^[0-9]*$", age);
			if(!isnum) {
				System.out.println("나이는 숫자로 입력해 주세요");
			}
			
			//이메일 검사
			boolean isemail = Pattern.matches
					("^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$"
								, email);
			if(!isemail) {
				System.out.println("이메일 형식에 맞지 않습니다");
				return;
			}
			
			// 숫자 검사
			boolean isphone = Pattern.matches("^01(?:0|1|[6-9])(?:\\d{3}|\\d{4})\\d{4}$"
					, phone);
			if(!isphone) {
				System.out.println("폰번호는 -를 제외한 숫자로만 입력해주십시오");
				return;
			}
			System.out.println("회원가입절차를 시작합니다");
			
			
		}

}
