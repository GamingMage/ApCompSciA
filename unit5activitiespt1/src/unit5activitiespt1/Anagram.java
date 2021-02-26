package unit5activitiespt1;

/*
 * Name: Joseph Liang
 * Date: 2/25/21
 * Purpose: Write a program that determines if one String is an anagram of another String.
 */

public class Anagram {

	private static String noSpaces(String s) {
		String hold = "";
		while (s.indexOf(" ") != -1) {
			hold = s.substring(0, s.indexOf(" "));
			s = s.substring(s.indexOf(" ") + 1);
			s = hold + s;
		}
		return s;
	}
	
	public static boolean testAnagram(String str1, String str2) {
		str1 = noSpaces(str1);
		//str1 = str1.replace(" ", "");
		str2 = noSpaces(str2);
		//str2 = str2.replace(" ", "");
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
//		System.out.println(str1);
//		System.out.println(str2);
		
		if (str1.length() != str2.length()) {
			return false;
		}
		
		int count = 0;
		for (int i = 0; i < str2.length(); i++) {
			int oneCharChange = 0;
			char x = str1.charAt(i);
			for (int k = 0; k < str2.length(); k++) {
				if (str2.charAt(k) == x) {
					oneCharChange++;
				}
			}
			if (oneCharChange >= 1) {
				count++;
			}
		}
		
		return str2.length() == count;
	}
	
}
