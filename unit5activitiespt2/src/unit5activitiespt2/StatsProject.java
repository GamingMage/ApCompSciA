package unit5activitiespt2;

/*
 * Name: Joseph Liang
 * Date: 3/16/21
 * Purpose: Create an array of 100 random ints between -50 and 50
 * 			inclusive. Find and display the mean, median, and mode of these numbers,
 * 			as well as a table of the numbers and their frequencies.
 */

public class StatsProject {

	public static int[] freqList(int[] arr) {
		int[] freq = new  int[101];
		for (int i = 0; i < freq.length; i++) {
			for (int k = 0; k < arr.length; k++) {
				if (arr[k] == (i-50)) {
					freq[i]++;
				}
			}
		}
		return freq;
	}
	public static double findMean(int[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += (i-50.0)*arr[i];
		}
		return sum/100;
	}
	public static double findMed(int[] arr) {
		double upCount = 0;
		double downCount = 0;
		int x = 0;
		int y = 0;
		for (int i = 0; upCount < 50; i++) {
			upCount += arr[i];
			x = (i-50);
		}
		for (int i = arr.length - 1; downCount > 50; i--) {
			downCount += arr[i];
			y = (i-50);
		}
		if (y == x) {
			return x;
		}else {
			return (y + x)/2;
		}
	}
	public static int findMode(int[] arr) {
		int x = arr[0];
		int count = 1;
		for (int i = 1; i < arr.length; i++) {
			if (x == arr[i]) {
				count++;
			}else {
				x = arr[i];
			}
		}
	}
	
	public static void main(String[] args) {
		int[] rand = new int[100];
		
		for (int i = 0; i < rand.length; i++) {
			rand[i] = (int)(Math.random()*(50 + 50 + 1)) - 50;
		}
		
		int[] freq = freqList(rand);
		boolean number = true;
		for (int i = 0; i < freq.length; i++) {
			if (number) {
				if ((i-50)%10 == 0 && (i-50) != 50) {
					System.out.print("Number: ");
				}
				System.out.print((i - 50) + "\t");
				if ((i-50) < 0 && (i-50+1)%10 == 0) {
					System.out.println();
					number = false;
					i -= 9;
				} else if ((i-50) > 0 && (i-50-9)%10 == 0 && (i-50) != 49) {
					System.out.println();
					number = false;
					i -= 9;
				} else if ((i-50) == 50) {
					System.out.println();
					number = false;
					i -= 10;
				}
			} else {
				if ((i-50-1)%10 == 0 && (i-50) != 50) {
					System.out.print("Freq:\t");
				}
				System.out.print(freq[i] + "\t");
				if ((i-50) < 0 && (i-50+1)%10 == 0) {
					System.out.println();
					number = true;
				} else if ((i-50) > 0 && (i-50-9)%10 == 0 && (i-50) != 49) {
					System.out.println();
					number = true;
				} else if ((i-50) == 50) {
					System.out.println(freq[i]);
				}
			}
			
		}
		System.out.println("The mean is: " + findMean(freq));
		System.out.println("The median is: " + findMed(freq));

	}

}
