package overload;

public class Main04 {
	public static void main(String[] args) {
		Article a1 = new Article(1,"첫게시물","자바학생");
		System.out.println(a1);
		
		Article a2 = new Article(2,"자바학생");
		System.out.println(a2);
		
		Article a3 = new Article(3);
		System.out.println(a3);
		
		
	}
}
