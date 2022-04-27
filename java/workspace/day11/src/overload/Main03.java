package overload;

public class Main03 {
	public static void main(String[] args) {
		Member mb = new Member();
		System.out.println(mb.toString());
		
		Member mb1 = new Member("직업1");
		System.out.println(mb1.toString());

		Member mb2 = new Member(12);
		System.out.println(mb2.toString());
		
		Member mb3 = new Member(12,"직업1");
		System.out.println(mb3.toString());
		
		Member mb4 = new Member("직업1",12);
		System.out.println(mb4.toString());
		
		
		
	} 
	
}
