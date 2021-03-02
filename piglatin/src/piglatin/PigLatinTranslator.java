package piglatin;

/*
 * Name: Joseph Liang
 * Date: 3/1/21
 * Purpose: Take an input of a sentence and output that sentence in piglatin
 */

public class PigLatinTranslator {
	
	/**
	 * Takes words as input and outputs them in piglatin. NOTE: THIS DOES NOT ACCOUNT FOR PUNCTUATION OF ANY KIND!
	 * @param str
	 * @return
	 */
	public static String translate(String str) {
		int previous = 0;
		String sentence = "";
		sentence = sentence.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				if (previous == 0) {
					sentence += translateWord(str.substring(previous, i)) + " ";
				} else {
					sentence += translateWord(str.substring(previous + 1, i)) + " ";
				}
				previous = i;
			}
		}
		sentence += translateWord(str.substring(previous + 1)) + " ";
		return sentence;
	}
	
	private static String translateWord(String str) {
		str = str.toLowerCase();
		if (beginsWithVowel(str)) {
			str += "yay";
		}else if (beginsWithBlend(str)) {
			String front = "" + str.charAt(0) + str.charAt(1);
			str = str.substring(2) + front + "ay";
		}else {
			String front = "" + str.charAt(0);
			str = str.substring(1);
			str += front + "ay";
		}
		return str;
	}
	
	private static boolean beginsWithVowel(String str) {
		if (str.charAt(0) == 'a') {
			return true;
		}else if (str.charAt(0) == 'e') {
			return true;
		}else if (str.charAt(0) == 'i') {
			return true;
		}else if (str.charAt(0) == 'o') {
			return true;
		}else if (str.charAt(0) == 'u') {
			return true;
		}else {
			return false;
		}
	}
	private static boolean beginsWithBlend(String str) {
		if (str.charAt(0) == 'c' && str.charAt(1) == 'h') {
			return true;
		}else if (str.charAt(0) == 's' && str.charAt(1) == 't') {
			return true;
		}else if (str.charAt(0) == 'w' && str.charAt(1) == 'h') {
			return true;
		}else if (str.charAt(0) == 't' && str.charAt(1) == 'h') {
			return true;
		}else if (str.charAt(0) == 'p' && str.charAt(1) == 'h') {
			return true;
		}else if (str.charAt(0) == 'q' && str.charAt(1) == 'u') {
			return true;
		}else {
			return false;
		}
	}

}
