public class exo13 {
	public static void main(String[] arg) throws Exception {
		int a = 24;
		int b = 42;
		int tmp = a;

		a = b;
		b = tmp;

		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
