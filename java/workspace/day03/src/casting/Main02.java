package casting;

public class Main02 {
	public static void main(String[] args) {
		long l = 100L;
		int i = (int) l;
		short s = (short) i;

		System.out.println("l : " + l);
		System.out.println("i : " + i);
		System.out.println("s : " + s);
	}
}
