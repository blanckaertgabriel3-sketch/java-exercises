import java.util.Objects;

public class exo5 {
	public static void main(String[] args) throws Exception {
		//Exercice5
        Integer a = null;
        Integer b = Objects.requireNonNullElse(a, 42);

        System.out.println(b);

	}
}
