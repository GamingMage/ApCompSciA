package unit5activitiespt1;

/*
 * Name: Joseph Liang
 * Date: 2/25/21
 * Purpose: Write a program that determines if one String is an anagram of another String.
 */

public class AnagramRunner {
	
	public static void main(String[] args) {
		
		String first = "Tom Marvolo Riddle";
		String second = "I am Lord Voldemort";
		
//		first = first.substring(first.indexOf('o') + 1);
//		System.out.println(first);
//		first = first.substring(first.indexOf('o') + 1);
//		System.out.println(first);
//		first = first.substring(first.indexOf('o') + 1);
//		System.out.println(first);
//		first = first.substring(first.indexOf('o') + 1);
//		System.out.println(first.indexOf('o') != -1);
		
		if (Anagram.testAnagram(first, second)) {
			System.out.println("Anagrams!");
		} else {
			System.out.println("Not anagrams.");
		}

	}

}
