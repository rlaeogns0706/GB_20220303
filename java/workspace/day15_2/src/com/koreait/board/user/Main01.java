package com.koreait.board.user;

import com.koreait.board.Article;
/*
 * 이런 번거로움을 피하고자 클래스 정의 전에 
 * import 구문을 사용하여 클래스으이 이름이 어떤 패키지에 
 * 소속되어 있는지를 명시할 수 있다.
 */
public class Main01 {
		public static void main(String[] args) {
			
			/*
			 * 패키지에 속해있는 클래스에대한 객체생성
			 * 다른패키지의 클래스를 사용하고자 할 경우
			 * 패키지 이름을 포함한 fullname으로 사용해야 한다
			 */
//			com.koreait.board.Article.setCategory("공지사항");
//			com.koreait.board.Article article =
//					new com.koreait.board.Article(1, "첫번째", "22.03,28");
//			
			Article.setCategory("공지사항");
			Article article =	new Article(1, "첫번째", "22.03,28");
			
		}

}
