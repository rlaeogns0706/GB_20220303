package collection;

import java.util.ArrayList;

import java.util.List;

public class Main03 {
	public static void main(String[] args) {
		// people class arryList
		List<People> plist = new ArrayList<People>();

		// 10명 데이터
		//plist.add(new People("회원1","010-1231-2312"));
		for (int i = 0; i < 10; i++) {
			People p = new People("회원" + i, "010-123-123" + i);
			plist.add(p);
		}

		// 출력하기
		for(int i =0 ; i<plist.size(); i++) {
			//list저장된 데이터 하나 꺼내면
			// people 객체다
			People item = plist.get(i);
			System.out.println(item.toString());
		}
		
		
		
	}
}
