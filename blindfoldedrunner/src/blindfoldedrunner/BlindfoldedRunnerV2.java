package blindfoldedrunner;

/*
 * Name: Joseph Liang
 * Date: 11/20/20
 * Purpose: Simulate a blind runner using random values until he/she/they crash into a wall 
 * 			and adjust the size of the path with a constant
 */

public class BlindfoldedRunnerV2 {

	public static void main(String[] args) {
		
		//This constant controls the size of the track
		final int pathWidth = 11;
		int runnerPos = pathWidth/2 + 1;
		int steps = -1;
		
		while (runnerPos >= 0 && runnerPos <= pathWidth) {
			steps++;
			System.out.print("|");
			for (int i = 1; i <= 2; i++) {
				if (i == 1) {
					for (int j = 1; j <= pathWidth - runnerPos; j++) {
						System.out.print(" ");
					}
					System.out.print("+");
				} else if (i == 2) {
					for (int j = 1; j <= pathWidth - (pathWidth - runnerPos); j++) {
						System.out.print(" ");
					}
				}
			}
			System.out.println("|");
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
