public class exo8 {
	// exo8
    public static void main(String[] args) throws Exception {
		/**
        String myArray42 = "myArray42";
        String w = "La grande réponse sur la vie, l univers et le reste !";
        String a = w + myArray42;
        System.out.println(a);
		*/
		
		String word = "quarante-deux";
        char[] myArray42 = word.toCharArray();
		String newWord = new String(myArray42);
        String w = "La grande réponse sur la vie, l univers et le reste !";
        String a = newWord + w;
		
		System.out.println(a);
    }
}
