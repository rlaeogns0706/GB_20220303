package override;

class Hello3{
	public Hello3(String msg){
		System.out.println(msg);
	}
}

class Korean3 extends Hello3{
	//부모와 동일한 파라미터를 받도록 생성자를 정의하고
	//전달받은 파라미터를 부모에게 재전달한다
	public Korean3(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}
	
}

public class Main03 {

}
