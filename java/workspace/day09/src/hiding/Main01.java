package hiding;

import hiding.StudentJava2;

public class Main01 {
	public static void main(String[] args) {
		//객체 생성
				StudentJava2 st = new StudentJava2();
				//setter 데이터 세팅 
				st.setterAge(20);
				st.setterName("Rlaeogns");
				//getter 출력 
				System.out.println(st.getterAge());
				System.out.println(st.getterName());
	}
}
