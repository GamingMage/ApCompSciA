package piglatin;

public class PigLatinRunner {

	public static void main(String[] args) {
		
		String sentence = "The quick brown fox jumps over the lazy dog";
		//String sentence = "Hello my name is Joseph";
		
		System.out.print(PigLatinTranslator.translate(sentence));

	}

}
