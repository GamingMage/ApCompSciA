package twodarray;

/*
 * Name: Joseph Liang
 * Date: 3/14/21
 * Purpose: Create and manipulate a two-d array
 */

public class TwoDArray {

	public static void print2D(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Sudent " + (i+1) + ": ");
			for (int x: arr[i]) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}
	public static void avg2D(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			double sum = 0;
			System.out.print("Sudent " + (i+1) + " Average: ");
			for (int x: arr[i]) {
				sum += x;
			}
			sum /= arr[i].length;
			System.out.println(sum);
		}
	}
	public static double[] testAvg(int[][] arr) {
		double[] avg = new double[arr[0].length];
		for (int i = 0; i < arr[0].length; i++) {
			double sum = 0;
			for (int k = 0; k < arr.length; k++) {
				sum += arr[k][i];
			}
			avg[i] = sum/arr.length;
		}
		return avg;
	}
	public static boolean[] improving(int[][] arr) {
		int a, b;
		boolean[] better = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
			a = arr[i][0];
			for (int k = 1; k < arr[i].length; k++) {
				b = arr[i][k];
				if (b > a) {
					a = b;
					better[i] = true;
				} else {
					better[i] = false;
					break;
				}
			}
		}
		return better;
	}
	
	public static void main(String[] args) {
		final int NUM_STUDENTS = 20;
		final int NUM_TESTS = 5;
		
		int[][] scores = new int[NUM_STUDENTS][NUM_TESTS];
		
		for (int i = 0; i < scores.length; i++) {
			for (int k = 0; k < scores[i].length; k++) {
				scores[i][k] = (int)(Math.random()*(100 - 60 + 1)) + 60;
			}
		}
		print2D(scores);
		System.out.println();
		avg2D(scores);
		System.out.println();
		
		double[] testAvg = testAvg(scores);
		for (int i = 0; i < testAvg.length; i++) {
			System.out.println("Test " + (i+1) + " Average: " + testAvg[i]);
		}
		System.out.println();
		
		boolean[] improvingScores = improving(scores);
		String out = "";
		for (int i = 0; i < improvingScores.length; i++) {
			if (improvingScores[i]) {
				out += (i+1) + " ";
			}
		}
		if (out.equals("")) {
			System.out.println("Unfortunately, there are no improving students.");
		} else {
			System.out.println("Improving Students: " + out);
		}

	}

}
