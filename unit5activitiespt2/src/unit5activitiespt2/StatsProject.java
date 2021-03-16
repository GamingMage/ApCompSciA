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

	}

}
