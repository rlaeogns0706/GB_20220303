package collection;

import java.util.HashMap;
import java.util.Map;

public class Main01 {
	public static void main(String[] args) {
		//데이터를 저장할 배열 생성
		//제너릭 - > <값의 이름,값의 종류>
		Map<String, Integer> hm = new HashMap<String,Integer>();
		
		//데이터 추가는 put 메서드 사용
		hm.put("국어", 95);
		hm.put("수학", 90);
		hm.put("영어", 85);
		hm.put("수학", 100);
		hm.put("영어", null);
		
		//저장된 갯구 얻어
		System.out.println("HashMap size : " +hm.size()) ;
		
		//데이터 꺼내기
		System.out.println(hm.get("국어"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}