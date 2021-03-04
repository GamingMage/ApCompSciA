package introtoarrays;

/*
 * Name: Joseph Liang
 * Date: 3/4/21
 * Purpose: Create and manipulate arrays
 */

public class ArrayTasks {

	public static int linearSearch(int[] arr, int x) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] array1 = new int[30];
		
		for (int i = 0; i < array1.length; i++) {
			array1[i] = (int)(Math.random() * (21)) - 10;
		}
		System.out.print("[");
		for (int i = 0; i < array1.length - 1; i++) {
			System.out.print("" + array1[i] + ", ");
		}
		System.out.println("" + array1[array1.length - 1] + "]");
		
		int[] array2 = new int[30];
		for (int i = 0; i < array2.length; i++) {
			array2[i] = array1[i];
		}
		array2[0] = 100;
		
		System.out.print("[");
		for (int i = 0; i < array1.length - 1; i++) {
			System.out.print("" + array1[i] + ", ");
		}
		System.out.println("" + array1[array1.length - 1] + "]");
		
		System.out.print("[");
		for (int i = 0; i < array2.length - 1; i++) {
			System.out.print("" + array2[i] + ", ");
		}
		System.out.println("" + array2[array2.length - 1] + "]");
		
		int sum = 0;
		for (int i = 0; i < array1.length; i++) {
			sum += array1[i];
		}
		System.out.println("The sum of array1 is: " + sum);
		
		int x = -10;
		if (linearSearch(array1, x) != -1) {
			System.out.println(x + " was found in the array at index " + linearSearch(array1, x) + ".");
		}else {
			System.out.println(x + " was not found in the array.");
		}

	}

}
