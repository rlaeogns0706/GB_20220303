package overload;

public class Main01 {
	public static void main(String[] args) {
		Character c = new Character();
		System.out.println(c.toString());
		
		c.setProperty(19);
		System.out.println(c.toString());
		c.setProperty("김대훈",12);
		c.setProperty(12,"회사원");
		System.out.println(c.toString());
	}
}
