package boxing;

public class Main01 {
	public static void main(String[] args) {
		// army 각각 객체생성
		Army ar = new Army("육군");
		Navy na = new Navy("해군");
		AirForce ai = new AirForce("공군");
		
		//각각 객체 고유기능 사용
		ar.tank();
		na.nucleus();
		ai.bombing();
		
		//상위 객체 형태로 암묵적형변환
		//상위클래스의 객체로 암묵적 형변환이 이루어지면 override된 기능만
		// 추가적 혹장기능은 안딤
		//모든 객체는 상위형태로 암묵적 형변환 가능
		Unit temp1 = ar;
		Unit temp2 = na;
		Unit temp3 = ai;
		
		//형변화이 되더라도 상속받거나 재정의한 
		//자신들의 기본 특성은 유지
		temp1.attack();
		temp2.attack();
		temp3.attack();
		
		//상위클래스로 형변환하면 독립기능 사용 x 
//		ar.tank();
//		na.nucleus();
//		ai.bombing();
		
		//다시 원래기능 되돌리기 위해
		//하위 클래스 형태로 명시적 형변환
		Army re1 = (Army)temp1;
		Navy re2 = (Navy)temp2;
		AirForce re3 = (AirForce)temp3;
		
		re1.tank();
		re2.nucleus();
		re3.bombing();
		
		
	}
}
