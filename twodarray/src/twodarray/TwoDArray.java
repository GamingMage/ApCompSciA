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
		double[] avg = new double[4];
		for (int i = 0; i < arr[0].length; i++) {
			double sum = 0;
			for (int k = 0; k < arr.length; k++) {
				sum += arr[k][i];
			}
			avg[i] = sum/arr.length;
		}
		return avg;
	}
	
	public static void main(String[] args) {
		final int NUM_STUDENTS = 25;
		
		int[][] scores = new int[NUM_STUDENTS][4];
		
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

	}

}
