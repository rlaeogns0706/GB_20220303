package collection;

import java.util.ArrayList;
import java.util.List;

public class Main02 {
	public static void main(String[] args) {
		
		/*
		 * 객체 생성시 제너릭스의 사용
		 * -> 클래스 이름 오른쪽에 <자료형>의 형식으로 표현한다
		 * 
		 * 
		 * 
		 * 
		 */
		
		List<Integer> numberList = new ArrayList<Integer>();
		
		//데이터 추가하기
		numberList.add(10);
		numberList.add(20);
		numberList.add(30);
		numberList.add(40);
		numberList.add(50);
		numberList.add(60);
		numberList.add(70);
		numberList.add(80);
		numberList.add(90);
		
		
		//데이터의 수량
		System.out.println(numberList.size());
		
		//5번째 요소의 값 50
		System.out.println(numberList.get(4));
		
		//5번째 값 삭제
		numberList.remove(4);
		
		//5번째 다시출력
		System.out.println(numberList.get(4));
		
		
		
		
		
		
	}
}
