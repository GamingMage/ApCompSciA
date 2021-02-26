package unit5activitiespt1;

/*
 * Name: Joseph Liang
 * Date: 2/25/21
 * Purpose: Write a program that determines if one String is an anagram of another String.
 */

public class Anagram {

	private static boolean testChar(String str1, String str2, char char1) {
		int charCount1 = 0;
		int charCount2 = 0;
		
		while (str1.length() > 1 && str2.length() > 1 && str1.indexOf(char1) != -1 && str2.indexOf(char1) != -1) {
			if (str1.indexOf(char1) != -1) {
				charCount1++;
				str1 = str1.substring(str1.indexOf(char1) + 1);
			}
			if (str2.indexOf(char1) != -1) {
				charCount1++;
				str2 = str2.substring(str2.indexOf(char1) + 1);
			}
		}
//		for (int i = 0; i < str1.length(); i++) {
//			if (str1.indexOf(char1) != -1) {
//				charCount1++;
//				str1 = str1.substring(str1.indexOf(char1) + 1);
//			}
//			if (str2.indexOf(char1) != -1) {
//				charCount1++;
//				str2 = str2.substring(str2.indexOf(char1) + 1);
//			}
//		}
		
		return charCount1 == charCount2;
	}
	
	public static boolean testAnagram(String str1, String str2) {
		str1 = str1.replace(" ", "");
		str2 = str2.replace(" ", "");
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
//		System.out.println(str1);
//		System.out.println(str2);
		
		if (str1.length() != str2.length()) {
			return false;
		}
		
		for (char x = 'a'; x <= 'z'; x++) {
			if (!testChar(str1, str2, x)) {
				return false;
			}
		}
		
		return true;
	}
	
}
