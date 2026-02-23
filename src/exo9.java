
public class exo9 {
	public static void main(String[] args) throws Exception {
	   int randomNum = (int)(Math.random() * 42) + 1; // 0 to 42
	   boolean est42 = (randomNum == 42);
	   System.out.println(est42);
	}
}
