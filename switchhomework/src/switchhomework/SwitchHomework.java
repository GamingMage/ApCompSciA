package switchhomework;

import java.util.Scanner;

/*
 * Name: Joseph Liang
 * Date: 10/28/20
 * Purpose: Take an input and use a switch to choose an output
 */

public class SwitchHomework {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		int switchCase = 0;
		
		System.out.println("Welcome to my Animal Sounds Menu!\n");
		System.out.print("Please choose which animal’s sound you would like to\nhear ... well, read really." + 
				"\n\n1 - Dog\n\n2 - Cat\n\n3 - Horse\n\n4 - Duck\n\n5 - Goose\n\n6 - Cow\n\n7 - Sheep\n\n8 - Pig" +
				"\n\nYour Selection: ");
		switchCase = userInput.nextInt();
		
		switch(switchCase) {
			case 1:
				System.out.print("\nWOOF!");
				break;
			case 2:
				System.out.print("\nMEOW!");
				break;
			case 3:
				System.out.print("\nNEIGH!");
				break;
			case 4:
				System.out.print("\nQUACK!");
				break;
			case 5:
				System.out.print("\nHONK!");
				break;
			case 6:
				System.out.print("\nMOO!");
				break;
			case 7:
				System.out.print("\nBAA!");
				break;
			case 8:
				System.out.print("\nOINK!");
				break;
			default:
				System.out.print("\nNot a valid selection.");
				break;
		}
		
		userInput.close();
	}

}
