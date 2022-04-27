package pattern;

import java.util.regex.Pattern;

public class RegexHelper {
	/*
	 * 싱글톤 isValue(String str), str : 검사할 문자열, 기능 - 공백 , null 체크 없어야함 boolean
	 * isNum(String str), str : 검사할 문자열 숫자형식 검증 boolean 
	 * isEng(String str), str :영문인지 체크 boolean 
	 * isKor(String str), str: :한글인지 
	 * isEngNum 영문숫자 
	 * isKorNum 한글숫자
	 * isEmail 이메일형식 
	 * isCellPhone 휴대전화형식
	 * 
	 */ 

	public static RegexHelper str;

	public static RegexHelper getInstance() {
		if (str == null) {
			str = new RegexHelper();
		}
		return str;
	}
	
	public static void freeInstance() {
		str = null;
	}
	
	private RegexHelper() {
		super();
	}
	
	//--------------------------------------------
	public boolean isValue(String str) {
		boolean result = false;
		if(str != null) {
			result =!str.trim().equals(""); //trim 앞뒤 공백 제거	
		}
		return result;
	}
	public boolean isNum(String str) {
		boolean isNum = false;
		if(isValue(str)) {
		 isNum = Pattern.matches("^[0-9]*$", str);
		if(!isNum) {
			System.out.println("숫자확인");
		}
	}
		return isNum;
	}
	public boolean isEng(String str) {
		boolean isEng = false;
		if(isValue(str)) {
		isEng = Pattern.matches("^[a-zA-Z]*$", str);
		if(!isEng) {
			System.out.println("영어확인");
		}
		}
		return isEng;
	}
	public boolean isKor(String str) {
		boolean isKor = false;
		if(isValue(str)) {
		 isKor = Pattern.matches("^[ㄱ-ㅎ가-힣]*$", str);
		if(!isKor) {
			System.out.println("한국어확인");
		}
		}
		return isKor;
	}
	public boolean isEmail(String str) {
		
		boolean isEmail = false;
		if(isValue(str)) {
		 isEmail = Pattern.matches(
"^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$"
, str);
		if(!isEmail) {
			System.out.println("이메일형식확인");
		}
		}
		return isEmail;
	}
	public void isCellPhone(String str) {
		boolean isCellPhone = Pattern.matches("^01(?:0|1|[6-9])(?:\\d{3}|\\d{4})\\d{4}$", str);
		if(!isCellPhone) {
			System.out.println("전화번호확인");
			return;
		}
	}
	public boolean isEngNum(String str) {
		
		boolean isEngNum = false;
		if(isValue(str)) {
		isEngNum = Pattern.matches("^[a-zA-Z0-9]*$", str);
		if(!isEngNum) {
			System.out.println("영어숫자확인");
		}
		}
		return isEngNum;
	}
	public boolean isKorNum(String str) {
		boolean isKorNum = false;
		if(isValue(str)) {
		isKorNum = Pattern.matches("^[ㄱ-ㅎ가-힣0-9]*$", str);
		if(!isKorNum) {
			System.out.println("한국어숫자확인");
		}
		}
		return isKorNum;
	}
	

}
