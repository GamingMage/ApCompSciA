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
		final int PATH_WIDTH = 11;
		final int TIMES_RUN = 1000;
		int runnerPos = PATH_WIDTH/2 + 1;
		int pathChange;
		int steps = -1;
		int avg = 0;
		int min = 0;
		int max = 0;
		int x1 = 0, x2 = 0, x3 = 0, x4 = 0, x5 = 0, x6 = 0, x7 = 0, x8 = 0, x9 = 0, x10 = 0, x11 = 0, x12 = 0, x13 = 0;
		
		for (int i = 1; i <= TIMES_RUN; i++) {
			steps = -1;
			runnerPos = PATH_WIDTH/2 + 1;
			while (runnerPos >= 0 && runnerPos <= PATH_WIDTH) {
				steps++;
				/*System.out.print("|");
				for (int k = 1; k <= 2; k++) {
					if (k == 1) {
						for (int j = 1; j <= PATH_WIDTH - runnerPos; j++) {
							System.out.print(" ");
						}
						System.out.print("+");
					} else if (k == 2) {
						for (int j = 1; j <= PATH_WIDTH - (PATH_WIDTH - runnerPos); j++) {
							System.out.print(" ");
						}
					}
				}
				System.out.println("|");*/
				pathChange = (int)(Math.random() * ((3 - 1) + 1) + 1);
				if (pathChange == 1) {
					runnerPos--;
				} else if (pathChange == 3) {
					runnerPos++;
				}
			}
			avg += steps;
			if (i == 1) {
				min = steps;
				max = steps;
			} else if (i != 1) {
				if (min > steps) {
					min = steps;
				}
				if (max < steps) {
					max = steps;
				}
			}
			if (steps <= 44) {
				x1++;
			} else if (steps <= 84) {
				x2++;
			} else if (steps <= 124) {
				x3++;
			} else if (steps <= 164) {
				x4++;
			} else if (steps <= 204) {
				x5++;
			} else if (steps <= 244) {
				x6++;
			} else if (steps <= 284) {
				x7++;
			}
		}
		avg /= 1000;
		System.out.println("Blindfolded Runner Simulation:\n\nTimes Run: " + TIMES_RUN + "\n");
		System.out.println("Average Steps Taken: " + avg + "\n");
		System.out.println("Minimum Steps: " + min + "\nMaximum Steps: " + max + "\n");
		//System.out.print("Crash!\tSteps Taken: " + steps);

	}

}
