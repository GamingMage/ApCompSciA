package blindfoldedrunner;

/*
 * Name: Joseph Liang
 * Date: 11/20/20
 * Purpose: Simulate a blind runner using random values until he/she/they crash into a wall
 */

public class BlindfoldedRunner {

	public static void main(String[] args) {
		
		int runnerPos = 0;
		int steps = -1;
		
		while (runnerPos >= -5 && runnerPos <= 5) {
			switch (runnerPos) {
				case -5:
					System.out.println("|+          |");
					steps++;
					break;
				case -4:
					System.out.println("| +         |");
					steps++;
					break;
				case -3:
					System.out.println("|  +        |");
					steps++;
					break;
				case -2:
					System.out.println("|   +       |");
					steps++;
					break;
				case -1:
					System.out.println("|    +      |");
					steps++;
					break;
				case 0:
					System.out.println("|     +     |");
					steps++;
					break;
				case 1:
					System.out.println("|      +    |");
					steps++;
					break;
				case 2:
					System.out.println("|       +   |");
					steps++;
					break;
				case 3:
					System.out.println("|        +  |");
					steps++;
					break;
				case 4:
					System.out.println("|         + |");
					steps++;
					break;
				case 5:
					System.out.println("|          +|");
					steps++;
					break;
				default:
					break;
			}
			if ((int)(Math.random() * ((3 - 1) + 1) + 1) == 1) {
				runnerPos--;
			} else if ((int)(Math.random() * ((3 - 1) + 1) + 1) == 3) {
				runnerPos++;
			} else {
				
			}
		}
		System.out.print("Crash!\tSteps Taken: " + steps);

	}

}
