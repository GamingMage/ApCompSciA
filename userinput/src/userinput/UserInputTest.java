package userinput;

import java.util.Scanner;

/*
 * Name: Joseph Liang
 * Date: 9/16/20
 * Purpose: Take inputs of doubles, strings, and ints, store them, manipulate them, and use them later
 */

public class UserInputTest {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		String userName;
		double userDouble1, userDouble2;
		int userAge, user100;
		
		System.out.println("Please enter your name to start.");
		userName = userInput.nextLine();
		System.out.println("Greetings, " + userName + "!");
		
		System.out.println("How old are you?");
		userAge = userInput.nextInt();
		user100 = 100 - userAge;
		System.out.println(userName + ", in " + user100 + " you will be 100.");
		
		System.out.println("Please input two doubles, " + userName + ".");
		userDouble1 = userInput.nextDouble();
		userDouble2 = userInput.nextDouble();
		System.out.println("Your doubles are: " + userDouble2 + " and " + userDouble1 + ".");
		
		userInput.close();
	}

}
